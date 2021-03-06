# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER Tal <houxiangxiang2117@gmail.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
# 仅作为示例，无实际用途
VOLUME /tmp
# 将jar包添加到容器中并更名为cloud-native-demo.jar
COPY cloud-native-demo-0.0.1-SNAPSHOT.jar cloud-native-demo.jar
# 运行jar包
RUN bash -c 'touch /cloud-native-demo.jar'
ENTRYPOINT ["java","-jar","/cloud-native-demo.jar"]