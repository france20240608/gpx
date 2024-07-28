#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20231130.sql ./mysql/db
cp ../sql/ry_config_20231204.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../gpx-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy gpx-gateway "
cp ../gpx-gateway/target/gpx-gateway.jar ./gpx/gateway/jar

echo "begin copy gpx-auth "
cp ../gpx-auth/target/gpx-auth.jar ./gpx/auth/jar

echo "begin copy gpx-visual "
cp ../gpx-visual/gpx-monitor/target/gpx-visual-monitor.jar  ./gpx/visual/monitor/jar

echo "begin copy gpx-modules-system "
cp ../gpx-modules/gpx-system/target/gpx-modules-system.jar ./gpx/modules/system/jar

echo "begin copy gpx-modules-file "
cp ../gpx-modules/gpx-file/target/gpx-modules-file.jar ./gpx/modules/file/jar

echo "begin copy gpx-modules-job "
cp ../gpx-modules/gpx-job/target/gpx-modules-job.jar ./gpx/modules/job/jar

echo "begin copy gpx-modules-gen "
cp ../gpx-modules/gpx-gen/target/gpx-modules-gen.jar ./gpx/modules/gen/jar

