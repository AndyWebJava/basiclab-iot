# BasicLab-AIoT 智慧视觉物联网云平台

<div align="center">
    <img src=".image/BasicLabLogo.png" width="50%" height="50%" alt="BasicLabLogo">
</div>

<div align="center">
    <img src="https://gitee.com/vegetable-chicken-blog/basiclab-iot/badge/star.svg" alt="GitEE stars">
    <img src="https://gitee.com/vegetable-chicken-blog/basiclab-iot/badge/fork.svg" alt="GitEE forks">
    <img src="https://img.shields.io/badge/version-v1.0-brightgreen.svg" alt="GitEE version">
    <img src="https://img.shields.io/badge/License-AGPL3.0-blue.svg" alt="GitEE license">
</div>

# 全网首创开源：基于视频、物联、AI服务一体化解决方案

#### BasicLab-AIoT 引领创新智慧视觉物联网云平台，无界融合物联网技术、流媒体摄像头实时传输与AI人工智能解析，开启智能监控与数据分析新纪元。

#### 我们不仅实现了设备的互联互通，更通过深度整合高清流媒体视频流与前沿AI算法，为摄像头监控增添了智能化的眼睛——精准执行人脸与行为识别、行为分析、风险人员筛查及区域入侵检测，重新定义了安防监控、智能制造及智慧城市管理的标准。

#### 这一创举不仅提升了数据处理的实时性和精确度，还极大地扩展了物联网应用的边界，让“看见”与“理解”的能力遍布每一个物联网节点，真正意义上实践了物联网+流媒体+AI的无缝融合，推动数字化转型迈向更深更广的领域。

![BasicLab-IoT平台架构.jpg](.image/BasicLabIoT物联网平台架构.jpg)

## 免责声明：

BasicLab-AIoT是一个开源学习项目，与商业行为无关。用户在使用该项目时，应遵循法律法规，不得进行非法活动。如果BasicLab-AIoT发现用户有违法行为，将会配合相关机关进行调查并向政府部门举报。用户因非法行为造成的任何法律责任均由用户自行承担，如因用户使用造成第三方损害的，用户应当依法予以赔偿。使用BasicLab-AIoT所有相关资源均由用户自行承担风险.

## 在线演示

地址：http://pro.basiclab.top:8888/
账号：admin
密码：Basiclab@456789

## 应用场景

#### 跨摄像头，车辆追踪/车牌识别（比如：逃犯）（可以摄像头实时检测追踪/录像回溯检测追踪）

<image src=".image/image/car.jpg" controls="" height=350 width=800> </image>

#### 跨摄像头，风险人员追踪（比如：暴徒）（可以摄像头实时检测追踪/录像回溯检测追踪）

<image src=".image/image/fengxian.jpg" controls="" height=350 width=800> </image>

#### 火车站、飞机站、公园门禁机/门闸机（比如：间谍）（可以摄像头实时检测追踪/录像回溯检测追踪）

<image src=".image/image/jiandie.jpg" controls="" height=400 width=1000> </image>

#### 安防人脸实时比对（比如：逃犯）（可以摄像头实时检测追踪/录像回溯检测追踪）

<image src=".image/image/face.jpg" controls="" height=450 width=800> </image>

## 系统截图（云主机没GPU，推理速度较慢，望各位见谅）
<div>
  <img src=".image/banner/banner37.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner38.png" alt="图片1" width="49%">
</div>
<div>
  <img src=".image/banner/banner39.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner40.png" alt="图片1" width="49%">
</div>
<div>
  <img src=".image/banner/banner1.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner14.png" alt="图片1" width="49%">
</div>
<div>
  <img src=".image/banner/banner21.png" alt="图片2" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner33.png" alt="图片3" width="49%">
</div>
<div>
  <img src=".image/banner/banner31.png" alt="图片2" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner8.png" alt="图片2" width="49%">
</div>
<div>
  <img src=".image/banner/banner34.png" alt="图片3" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner3.png" alt="图片3" width="49%">
</div>
<div>
  <img src=".image/banner/banner3.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner35.png" alt="图片2" width="49%">
</div>
<div>
  <img src=".image/banner/banner41.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner42.png" alt="图片1" width="49%">
</div>

## 联系方式

#### QQ交流群：🚀913496130

## Gitee同步仓库

https://gitee.com/vegetable-chicken-blog/BasicLab-AIoT

## 功能列表

- [x] AI算法服务
    - [x] AI视频可疑人员检测（通过分析视频监控画面，自动识别不符合常规行为模式的个体）
    - [x] AI可疑人员检索（在大量视频资料中快速查找特定个体）
    - [x] AI人脸检索匹配（利用人脸识别技术，在数据库中比对人脸图像，用于身份验证、安防监控等）
    - [x] AI可疑行为识别（自动识别打架斗殴、遗留物检测、异常聚集、翻越围栏、禁区闯入等行为）
    - [x] AI车牌识别与追踪（自动识别车辆车牌信息，并能追踪车辆行驶轨迹，应用于交通管理、停车场管理等场景）
    - [x] AI农作物病虫害检测（通过图像识别技术，早期识别农作物上的病虫害迹象，辅助精准施药）
    - [x] AI自然灾害监测（分析卫星或地面观测数据，提前预警洪水、火灾、地震等自然灾害）
    - [ ] 其他AI算法开发中...
- [x] 设备接入服务
    - [x] 视频监控设备
    - [x] MQTT协议
    - [x] TCP协议
    - [x] UDP协议
    - [x] HTTP协议
    - [x] Modubus-TCP协议
    - [x] Modebus-RTP协议
    - [x] OPC UA协议
    - [x] Copa协议
    - [x] NB-IOT协议
    - [x] ZigBee协议
    - [x] LoRA协议
- [x] 设备管理
    - [x] 产品分类
    - [x] 产品管理
    - [x] 设备分组
    - [x] 设备管理
    - [x] 物模型
    - [x] 设备详情
    - [x] 运行状态
    - [x] 设备日志
    - [x] 设备服务
    - [x] 设备事件
    - [x] 设备告警
    - [x] 设备控制
    - [x] 实时监测
    - [x] 设备调试
    - [x] 数据采集
    - [x] 设备赋能
    - [x] 设备点播
    - [x] 设备录像
    - [x] 云端录像
    - [x] 设备通道
    - [x] 设备批次
    - [x] 设备分享
    - [x] 设备配网
    - [x] 设备模板
    - [x] 边缘端映射
    - [x] 设备诊断
    - [x] 设备功能
- [x] 规则引擎
    - [x] 事件监听
    - [x] 数据筛选
    - [x] 消息存储
    - [x] 数据转发
    - [x] 数据存储
    - [x] KAFKA节点
    - [x] HTTP节点
    - [x] PREDICATE节点
    - [x] ROCKET_MQ节点
    - [x] RABBIT_MQ节点
    - [x] MYSQL节点
    - [x] POSTGRESQL节点
    - [x] INFLUXDB节点
    - [x] TDENGINE节点
    - [x] MQTT节点
    - [x] TOPIC节点
    - [x] LOG节点
    - [x] DEBUG节点
- [x] 场景联动
    - [x] 规则编排
    - [x] 设备触发
    - [x] 手动触发
    - [x] 定时触发
    - [x] 触发条件
    - [x] 动作编排
    - [x] 设备联动
    - [x] 场景定制
    - [x] 离家模式
    - [x] 回家模式
    - [x] 天气控制
    - [x] 智能控制
    - [x] 设备告警
- [x] 视频中心
    - [x] 集成化Web控制台
    - [x] 广泛兼容与稳定性
    - [x] 灵活设备接入管理
    - [x] 高清视频预览与流控制
    - [x] 云台操控自如
    - [x] 录像回放与智能检索
    - [x] 智能流量节省机制
    - [x] 实时设备信息更新
    - [x] 全天候监控体系
    - [x] 多协议流输出能力
    - [x] 即插即用体验
    - [x] 国标通讯与流传输双保障
    - [x] 精细查询与分类浏览
    - [x] 纯净视听体验
    - [x] 精确时间同步
    - [x] 先进视频编码支持
    - [x] 报警系统高效联动
    - [x] 双向语音通讯
    - [x] 事件通知与订阅服务
    - [x] 增强安全措施
    - [x] 国标级联扩展
    - [x] 注册与心跳机制
    - [x] 通道管理优化
    - [x] 自适应流媒体配置
    - [x] 智能负载均衡
    - [x] UDP性能强化
    - [x] 灵活部署选项
    - [x] 严格流与接口权限控制
    - [x] 云端录像存储
    - [x] 多样部署形态
    - [x] 跨域资源访问
    - [x] 监控设备巡检
- [x] 数据可视化
    - [x] 大屏展示
    - [x] 数据分析
    - [x] 图层管理
    - [x] 基础组件
    - [x] 装饰组件
    - [x] 条形图组件
    - [x] 柱状图组件
    - [x] 折线图组件
    - [x] 面积图组件
    - [x] 饼图组件
    - [x] 进度图组件
    - [x] 散点图组件
    - [x] 玫瑰图组件
    - [x] 地图组件
    - [x] 自定义组件
- [x] 组态管理
    - [x] 组态编排
    - [x] 组态图库
    - [x] 组态图表
    - [x] 组态组件
    - [x] 组态模型
- [x] 移动端
    - [x] 设备实时监控
    - [x] 设备控制面板
    - [x] 报警与通知
    - [x] 设备管理
    - [x] 数据可视化
    - [x] 地理定位与地图视图
    - [x] 场景自动化
    - [x] 能耗管理
    - [x] 历史数据查询
    - [x] 固件升级与维护
    - [x] 用户权限管理
    - [x] 离线操作与同步
    - [x] 语音控制集成
    - [x] API与第三方集成
- [x] 系统管理
    - [x] 用户管理
    - [x] 角色管理
    - [x] 菜单管理
    - [x] 部门管理
    - [x] 岗位管理
    - [x] 字典管理
    - [x] 参数设置
    - [x] 通知公告
    - [x] 日志管理
- [x] 系统监控
    - [x] 在线用户
    - [x] 定时任务
    - [x] 数据监控
    - [x] 服务监控
    - [x] 缓存监控
- [x] 系统工具
    - [x] 表单构建
    - [x] 代码生成
    - [x] 系统接口
- [ ] 开发中功能 ...

## 商用授权

BasicLab-AIoT采用AGPL3.0协议，可用于个人学习和使用，不允许商业使用，商业用途需要赞助项目，获得授权，并提供商业版本源码，赞助过的用户请下载商业版本源码。

- 二开项目同样遵守AGPL3.0协议进行开源，可以向原作者申请授权
- 如果商业项目想转闭源，可以向原作者申请或者购买闭源授权
- 不得进行简单修改包装声称是自己的项目
- 我们已经申请了相关的软件开发著作权和相关登记
- 如有使用我们项目功能等的扩展项目，请在项目介绍中，进行明确说明

## 支持作者

如果觉得项目不错，希望可以去BasicLab-AIoT帮我点个Star，谢谢您。