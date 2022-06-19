package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;
//简短的病毒信息简略
@Alias("briefvirus")
public class briefvirusEntity {
	//病毒id
		private  int virusid;
		//病毒名字
		private String name;
		//病毒分类之形状
		private String shape;
		//结构
		private String structbuild;
		//传播方式
		private String way;
		//关注人数
		private int eyenum;
		//图片链接
		private String pic;

		public int getVirusid() {
			return virusid;
		}

		public void setVirusid(int virusid) {
			this.virusid = virusid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

		public String getStructbuild() {
			return structbuild;
		}

		public void setStructbuild(String structbuild) {
			this.structbuild = structbuild;
		}

		public String getWay() {
			return way;
		}

		public void setWay(String way) {
			this.way = way;
		}

		public int getEyenum() {
			return eyenum;
		}

		public void setEyenum(int eyenum) {
			this.eyenum = eyenum;
		}

		public String getPic() {
			return pic;
		}

		public void setPic(String pic) {
			this.pic = pic;
		}
}
