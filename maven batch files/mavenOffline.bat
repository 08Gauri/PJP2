::batch files to prevent maven from downloading dependencies every time / Make maven work without internet
mvn dependency:go-offline 
call mvn –o clean package
