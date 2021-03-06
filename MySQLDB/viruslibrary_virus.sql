-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: viruslibrary
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `virus`
--

DROP TABLE IF EXISTS `virus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `virus` (
  `virusid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `subname` varchar(45) DEFAULT NULL,
  `disease` varchar(45) DEFAULT NULL,
  `infectingsort` varchar(45) DEFAULT NULL,
  `R` double DEFAULT NULL,
  `infection` varchar(45) DEFAULT NULL,
  `deathmount` varchar(45) DEFAULT NULL,
  `deathrate` double DEFAULT NULL,
  `introduction` longtext,
  `shape` varchar(45) DEFAULT NULL,
  `structbuild` varchar(45) DEFAULT NULL,
  `way` longtext,
  `fight` longtext,
  `eyenum` int DEFAULT '0',
  `foundtime` varchar(45) DEFAULT NULL,
  `createlogtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `disableflag` tinyint unsigned DEFAULT '0',
  PRIMARY KEY (`virusid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `virus`
--

LOCK TABLES `virus` WRITE;
/*!40000 ALTER TABLE `virus` DISABLE KEYS */;
INSERT INTO `virus` VALUES (1,'Coronavirus','冠状病毒',NULL,NULL,NULL,NULL,NULL,NULL,'冠状病毒属于套式病毒目（Nidovirales）、冠状病毒科（Coronaviridae）、冠状病毒属（Coronavirus），是许多家畜、宠物包括人类疾病的重要病原，引起多种急慢性疾病。根据系统发育树，冠状病毒可分为四个属：α、β、γ、δ，其中β属冠状病毒又可分为四个独立的亚群A、B、C和D群。 [1] ','冠状','RNA','直接传播、气溶胶传播和接触传播','对其预防有特异性预防，即针对性预防措施（疫苗，疫苗的研制是有可能的，但需要时间较长，解决病毒繁殖问题是其难题）和非特异性预防措施（即预防春季呼吸道传染疾病的措施，如保暖、洗手、通风、勿过度疲劳及勿接触病人，少去人多的公共场所等）。',0,'1965-03-19','2022-03-19 13:49:49',1),(2,'Prototype','杆状病毒',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'杆状','RNA',NULL,NULL,0,'2022-03-19','2022-03-19 13:49:49',1),(3,'Prototype','丝状病毒',NULL,NULL,NULL,NULL,NULL,NULL,'bugTwoLIke','丝状','DNA',NULL,NULL,0,'2022-03-10','2022-03-19 13:49:49',1),(8,'Prototype','球形病毒',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'球形','RNA',NULL,NULL,0,'2022-03-19','2022-03-19 13:49:49',1),(9,'Prototype','砖形病毒',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'砖形','DNA',NULL,NULL,0,'2022-03-19','2022-03-19 13:49:49',1),(10,'Prototype','弹形病毒',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'弹形','RNA',NULL,NULL,0,'2022-03-19','2022-03-19 13:49:49',1),(11,'Prototype','蝌蚪形病毒',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'蝌蚪形','RNA',NULL,NULL,0,'2022-03-19','2022-03-19 13:49:49',1),(12,'SARS-CoV','SARS病毒','非典','动物',4,'8000','800',15,'SARS病毒属于套式病毒目、冠状病毒科、冠状病毒属，为β属B亚群冠状病毒。 [1]  病毒粒子多呈圆形，有囊膜，外周有冠状排列的纤突,分布于细胞浆中，呈圆形，病毒直径在80～120nm之间。','冠状','RNA','1．主要通过近距离呼吸道飞沫及密切接触传播。特别是给危重患者行气管插管，气管切开等操作的医护人员，直接暴露于患者大量呼吸道飞沫环境下极易获得感染，曾有医护人员聚集被感染SARS的现象。','常规预防措施：与SARS疑似患者接触时，认真做好手部的卫生消毒是必要的，这包括用肥皂和水洗手，如果手上没有明显的污染，酒精棉球擦手可以代替洗手。',20,'2003-04-16','2022-03-19 14:17:46',0),(13,'HIV','人类免疫缺陷病毒','艾滋病','动物',3.4,'75700000','32700000',43,'人类免疫缺陷病毒又称艾滋病病毒，艾滋病（AcquiredImmune Deficiency Syndrome，AIDS）是人类免疫缺陷病毒感染的最后阶段 [1]  。进入艾滋病期，艾滋病病毒感染会引起各种机会性感染和肿瘤的发生，这些并发症会对人的健康生活带来影响，甚至可能会威胁生命，因此艾滋病病毒会引发人们的恐慌情绪','球形','RNA','通的接触不会造成艾滋病病毒的感染，只有通过直接接触艾滋病病毒感染者体内的某些体液（血液、精液和精前液、直肠液、阴道分泌液、母乳），才有可能被感染。这些体液中的艾滋病病毒通过黏膜（直肠、阴道、口腔或者阴茎头部）、开放性的伤口或者溃疡或直接注射等渠道进入人类的血液中。','人类免疫缺陷病毒在体外生存能力极差，不耐高温，抵抗力较低，离开人体不易生存 [3]  。只有通过直接接触艾滋病病毒感染者体内的某些体液（血液、精液和精前液、直肠液、阴道分泌液、母乳），才有可能被感染 [4]  。不涉及以上体液接触的普通接触，如同桌吃饭或共用餐具、水杯、脸盆、澡盆、马桶、毛巾等都不会造成艾滋病病毒传播和感染',5,'1981-06-05','2022-03-19 15:33:22',0),(14,'measles virus','麻疹病毒','麻疹','动物',18,'105500000','21100000',20,'麻疹病毒，属副黏病毒，呈球形，直径只有100～250纳米(1纳米=0.000001毫米)。在外界环境中抵抗力不算强，对干燥、日光、高温和一般消毒剂都没有抵抗力。在阳光下或空气流通环境中半小时就失去活力；在室温下仅存活2小时，56℃时30分钟即被破坏。能耐寒不怕冻，4℃可存活5个月，零下15℃能存活5年，所以总是冬春季节出来发作','球形','RNA','传播快速， 任何没患过麻疹又没接种过麻疹疫苗的人(易感人群)，只要跟正在患麻疹的病人见上一面，就会被感染。因为麻疹病毒就在麻疹病人的眼泪、鼻、口、咽和气管等分泌物中，通过喷嚏、咳嗽和说话等由飞沫传播。传染性极强，与易感者接触后90%以上均发病，麻疹病毒外号就叫“见面传”。以往每隔2～3年一次暴发流行，几乎是不可避免的。','麻疹的预防主要有加强体育锻炼，提高抗病能力， 隔离患者。麻疹传染力强，在流行期间，医疗防疫部门应组织医务人员对患者定期进行家庭访视，做到“病人不出门，医药送上门”，直到出疹后5天。托儿所、幼儿园要设置临时隔离室对患者进行隔离。对接触者应进行隔离观察2～3周；如无症状，才能回班活动。麻疹患者停留过的房间应开门窗通风20～30分钟。医护人员在接触患者后应脱去外衣洗手，或在户外活动20分钟后再接近易感者； 麻疹流行期间尽量少带孩子去公共场所（尤其是医院），少串门，以减少感染和传播机会。',9,'2500年前','2022-03-19 15:46:17',0),(15,'Variola virus','天花病毒','天花','动物',6,'3000000000000','1000000000000',30,'天花（Smallpox）是由天花病毒引起的一种烈性传染病，也是在世界范围内被人类消灭的一种传染病。感染天花病毒后的潜伏期平均约为12天（7-17天）。感染后的初期症状包括：高烧、疲累、头疼、心跳加速及背痛。2-3天后，会有典型的天花红疹明显地分布在脸部、手臂和腿部。在发疹的初期，还会有淡红色的块状面积伴随疹子而出现。病灶在几天之后开始化脓，直到第2个星期开始结痂。接下来的3-4周慢慢发展成疥癣，然后慢慢剥落。天花是感染痘病毒引起的，患者在痊愈后脸上会留有麻子，“天花”由此得名。','球形','DNA','天花病毒主要经呼吸道黏膜侵入人体，通过飞沫吸入或直接接触而传染。天花病毒有毒力不同的两型病毒株，毒力强的引起正型天花，即典型天花；弱者引起轻型天花，即类天花。','到目前为止，对天花还没有确定有效的治疗方法。感染天花的患者必须严格隔离直至痊愈，隔离时间不得少于发病40日。其衣物、用具、呼吸道分泌物、疱疹渗出物需要严格消毒，与患者接触的人员应该立即种痘。患者通常是以支持疗法进行治疗，给以充足水分及营养，例如静脉注射电解质、营养品或以药物控制高热或疼痛，同时对年幼体弱者以抗生素预防感染天花病毒后随之而来的细菌感染，加强护理，保持眼、口、鼻及皮肤清洁。对症治疗角膜溃疡、皮疹等。',9,'15世纪末','2022-03-19 15:51:55',0),(16,'2019-nCoV','新型冠状病毒','新型冠状肺炎','动物',5.7,'500000000','6000000',2.8,'人感染了冠状病毒后常见体征有呼吸道症状、发热、咳嗽、气促和呼吸困难等。在较严重病例中，感染可导致肺炎、严重急性呼吸综合征、肾衰竭，甚至死亡。对于新型冠状病毒所致疾病没有特异治疗方法。但许多症状是可以处理的，因此需根据患者临床情况进行治疗。此外，对感染者的辅助护理可能非常有效。做好自我保护包括：保持基本的手部和呼吸道卫生，坚持安全饮食习惯等','冠状','RNA','新型冠状病毒主要的传播途径还是呼吸道飞沫传播和接触传播，气溶胶和粪—口等传播途径尚待进一步明确。通过流行病学调查显示，病例多可以追踪到与确诊的病例有过近距离密切接触的情况。','（一）尽量减少外出活动。减少走亲访友和聚餐，尽量在家休息。减少到人员密集的公共场所活动，尤其是相对封闭、空气流动差的场所，例如公共浴池、温泉、影院、网吧、KTV、商场、车站、机场、码头和展览馆等。',33,'2019-3','2022-03-19 16:23:41',0),(17,'Ebola virus','埃博拉病毒','埃博拉出血热','动物',2.5,'128000','90000',70,'埃博拉病毒（Ebola virus）又译作伊波拉病毒。是一种十分罕见的病毒，于1976年在苏丹南部和刚果（金）（旧称扎伊尔）的埃博拉河地区发现。是一种能引起人类和其他灵长类动物产生埃博拉出血热的烈性传染病病毒，其引起的埃博拉出血热（EBHF）是当今世界上最致命的病毒性出血热，感染者症状与同为纤维病毒科的马尔堡病毒极为相似，包括恶心、呕吐、腹泻、肤色改变、全身酸痛、体内出血、体外出血、发烧等。死亡率在50%至90%不等， [1]  致死原因主要为中风、心肌梗塞、低血容量休克或多发性器官衰竭。','丝状','RNA','病毒可透过与患者体液直接接触，或与患者皮肤、黏膜等接触而传染。病毒潜伏期可达2至21天，但通常只有5至10天。','病毒主要存在于病人的体液、血液中，因此对病人使用过的注射器、针头、各种穿刺针、插管等，均应彻底消毒，最可靠的是使用高压蒸气消毒。埃博拉病毒还可能经过空气传播。实验人员将恒河猴的头部露出笼外，让其吸入直径1微米左右含病毒的气雾，猴子4～5天后发病。每天与病猴密切接触的6个工作人员的血清发现该病毒抗体阳性，其中5人没有受过外伤，也无注射史，因此认为可通过飞沫传播。',3,'2014-08-08','2022-05-02 15:40:47',0),(18,'Rabies Virus','狂犬病毒','狂犬病','动物',1,'0','0',99,'狂犬病是一种疫苗可预防的人畜共患病毒性疾病。一旦出现临床症状，狂犬病几乎100%致命。在高达99%的情况下，家犬是将狂犬病病毒传播给人类的原因。不过，狂犬病也可以感染家畜和野生动物。它通过咬伤或抓伤传播给人和动物，通常是经由唾液。','弹形','RNA','1、通过破损的皮肤和黏膜感染：2、经呼吸道感染','发生接触后，尽快彻底清创并对伤口进行局部处理；',0,'公元900年','2022-05-02 15:59:02',0),(19,'dengue virus','登革病毒','登革热','动物',NULL,'3900000000000','97500000000',2.5,'登革病毒为黄病毒科中的黄病毒属，是单股正链RNA病毒，病毒耐低温，在人血清中保存-20℃可存活5年，-70℃可存活8年以上，但不耐热，50℃加热30分钟或100℃加热2分钟即可灭活；不耐酸，用洗涤剂、乙醚、紫外线和0.65%甲醛溶液可以灭活。目前已分离出4个血清型的登革热病毒，均有致病性。伊蚊（包括埃及伊蚊和白纹伊蚊）是其主要宿主，患者和隐性感染者是主要传染源。患者在发病1日至发病后3日内传染性最强。少数患者在热退后第3日还可从血液中分离到病毒。','球形','RNA','登革病毒主要通过埃及伊蚊（Aedes ae－gyPti）和白纹伊蚊(Aedesalbopictus)等媒介昆虫传播，引起登革热（dengue fever，DF）以及发病率和死亡率很高的登革出血热（dengue hemorrhagic fever，DHF）和登革休克综合征（dengue shock syndrome，DSS）。病人及隐性感染者是本病的主要传染源，而丛林中的灵长类是维护病毒在自然界循环的动物宿主。将发热期患者血液接种到幼稚小鼠的脑内可被分离固定。','控制传播媒介 控制传播媒介、防止蚊虫叮咬是防治登革病毒感染的重要措施。曾使用杀虫剂消毒成蚊孳生地进行蚊虫控制。但由于杀虫剂的抗性等原因，主要通过清除蚊虫孳生场所、开展宣传教育增强居民自行清理蚊虫孳生场所的意识，改善环境卫生条件等方式控制蚊虫的数量。',2,'1869','2022-05-02 16:08:24',0),(20,'polio virus','脊髓灰质炎病毒','小儿麻痹症','动物',4.9,'0','0',90,'脊髓灰质炎病毒（poliovirus）是引起脊髓灰质炎的病毒，该疾病传播广泛，是一种急性传染病。病毒常侵犯中枢神经系统，损害脊髓前角运动神经细胞，导致肢体松弛性麻痹，多见于儿童，故又名小儿麻痹症。脊髓灰质炎是WHO推行计划免疫进行控制的重点传染病。','球形','RNA','脊髓灰质炎病毒是一种传染性很强的疾病。由于病毒可快速传播，当家里第一个病人被确诊时，所有血液中没有特异抗体的家庭成员就已经受到了感染。在脊髓灰质炎病人的家庭中，15岁以下的易感者100%会发病；而与脊髓灰质炎病人有日常接触的易感者中有87% 会发病。居住环境拥挤和卫生条件差可加速病毒的传播。','尚无特异的治疗脊髓灰质炎病毒感染的药物。对该病的控制主要依赖于疫苗的使用，被动免疫仅用于个别情况。',4,NULL,'2022-05-23 23:42:04',0),(21,'Lassa fever virus','拉沙病毒','拉沙热','动物',NULL,NULL,NULL,19.3,'拉沙病毒性出血热的病原为拉沙热病毒，拉沙热病毒是沙粒病毒科沙粒病毒属成员。病毒颗粒从圆形到多形，有囊膜，病毒包膜表面有“T”型突起，长度7－10nm，由病毒糖蛋白组成。病毒基因组RNA以环状核衣壳的形式存在于病毒粒子中，长度在400nm-1300nm之间。病毒粒子内部通常含有电子致密颗粒，在电镜下呈沙粒状红色，沙粒病毒就是因此而得名的，其电子致密颗粒是宿主的核糖体组分。','球形','RNA','人类通常通过暴露于受感染的Mastomys鼠的排泄物感染拉沙病毒。通过直接接触拉沙热患者的血液、尿、粪便或其它身体分泌物，直接暴露（接触排泄物）和拉沙病毒还可在人之间传播。尚无流行病学证据支持人之间通过空气传播。在社区和卫生保健环境中均可发生人际传播，那里病毒可通过再次使用的针头等受污染的医疗设备传播。已有报道通过性传播拉沙病毒。','拉沙热传染性极强，应采取严密隔离。接触病人应戴口罩及手套，穿隔离衣。排泄物及污染物须经严格消毒。隔离时间3-4周。尿中排病毒时间较长，应连续作尿病毒检查。实验室检查标本有传染性，应注意安全操作。血白细胞计数时，应加醋酸（20mg/L，PH2.9）。检查白细胞分类涂片以戊二醛固定，加热至60℃，可将病毒灭活。检查血中电解质等耐热物质，先加热后再检查。',0,NULL,'2022-05-23 23:55:56',0),(22,'Tulipa virus','郁金香碎色病毒','郁金香花瓣碎色','植物',0,'0','0',0,'报道郁金香碎色病毒仅侵染两种植物，Tulipa和Lilium，均属于百合科。可汁液传播和鳞茎嫁接传播。早在1637年Dutch种植者通过嫁接带有碎色花的鳞茎到花色一致的鳞茎上来生产花碎色的新郁金香变种（Hoog,1933）。导致郁金香品种及其杂交品种在红色和紫色变种中花色的断裂；它影响了花瓣中表皮细胞液泡的花青素的数量（Dufr oy,1931）。导致依赖郁金香变种和病毒株系的不同类型的颜色断裂。由于缺乏花青素，白色和黄色花变种无断裂现象，它们的颜色由叶肉中的无色或黄色质体决定。感染植物表现为叶片斑驳。','丝状','RNA','可通过摩擦接种的非介体传播和介体传播。已经报道了数个郁金香碎色病毒的蚜虫介体种类。','郁金香栽培主要集中于荷兰。在大不列颠，日本和澳大利亚，仅占全世界郁金香种植面积的小部分。因此，在本文中的防治方法主要描述了每年种植了10,000公顷以上郁金香的荷兰的防治情况。病毒的防治由几个简明描述的因素决定。郁金香碎色病毒（主要是郁金香碎色病毒）的全面发生率非常低。郁金香碎色病毒的症状学已相当明确，并且，栽培者有广泛知识(Asjes and Elbertsen, 1982)。人们不能接受染病郁金香品质的下降。',2,NULL,'2022-05-24 00:05:01',0);
/*!40000 ALTER TABLE `virus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02 15:56:06
