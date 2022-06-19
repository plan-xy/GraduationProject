package project.virus.graduate.library.advice;

import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import project.virus.graduate.library.wrapper.ResponseBodyBindWrapper;

/**
 * 利用Advice统一API返回结构。
 *
 * @author mingze.xia
 *
 */
@ControllerAdvice
@Order(1)
public class MyResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return converterType == MappingJackson2HttpMessageConverter.class;
    }

    @Override
    public ResponseBodyBindWrapper beforeBodyWrite(Object body, MethodParameter returnType,
        MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType,
        ServerHttpRequest request, ServerHttpResponse response) {

        ResponseBodyBindWrapper wrappedResponse;
        if (body instanceof ResponseBodyBindWrapper) {
            wrappedResponse = (ResponseBodyBindWrapper) body;
        } else {
            wrappedResponse = createSuccessResponse(body);
        }

        return wrappedResponse;
    }

    private ResponseBodyBindWrapper createSuccessResponse(Object response) {
        return new ResponseBodyBindWrapper("SUCCESS", response);
    }

}
