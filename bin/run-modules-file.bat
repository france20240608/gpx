@echo off
echo.
echo [��Ϣ] ʹ��Jar��������Modules-File���̡�
echo.

cd %~dp0
cd ../gpx-modules/gpx-file/target

set JAVA_OPTS=-Xms512m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m

java -Dfile.encoding=utf-8 %JAVA_OPTS% -jar gpx-modules-file.jar

cd bin
pause