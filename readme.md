## [GIS] GeoServer와 OpenLayers를 활용한 데이터 이용량 지도 구현

### 개요
- 각 지역 별로 에너지 사용량을 시각화하는 웹 페이지 구현
- GIS 분야 기업 프로젝트
- 이 프로젝트는 학생들 모두 개인 프로젝트로 진행하였음

### 특징
- Vworld API를 활용하여 배경지도를 불러올 수 있음.
- 지도 내 시/도, 시/군/구 별 레이어 구분 가능.
- 선택한 부분으로 이동 및 확대 기능
- 웹에서 다운받은 데이터를 DB에 저장하기 위해 파일 업로드 기능 구현
- 사용자 경험 개선을 위해 xhr을 활용하여 업로드 진행률에 따른 프로그레스 바 생성
- 업로드 된 데이터가 DB에 저장 성공/실패 여부에 따른 alert창
- 구글 차트를 이용하여 지역 별 통계 그래프 표시

### 기술 스택
<div style="display: flex; flex-wrap: wrap;">
  <img src="https://img.shields.io/badge/JAVA-3766AB?style=flat-square&logo=java&logoColor=black">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white">
  <img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
<img src="https://img.shields.io/badge/eclipseIDE-2C2255?style=flat-square&logo=eclipseide&logoColor=white">
<img src="https://img.shields.io/badge/openlayers-1F6B75?style=flat-square&logo=openlayers&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=flat-square&logo=github&logoColor=white">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
<img src="https://img.shields.io/badge/전자정부프레임워크-000000?style=flat-square&logo=framework&logoColor=white">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
<img src="https://img.shields.io/badge/apache%20tomcat-F8DC75?style=flat-square&logo=apache%20tomcat&logoColor=black"">
</div>
<br>
<div style="display: flex; flex-wrap: wrap;">
<img src="https://img.shields.io/badge/openlayers-1F6B75?style=flat-square&logo=openlayers&logoColor=white">
<img src="https://img.shields.io/badge/Qgis-589632?style=flat-square&logo=Qgis&logoColor=white">
</div>
<br>
