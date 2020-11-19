# MovieDa
> 영화 리뷰 사이트
  
## 개발 환경
**Front-end**
  * HTML5
  * CSS3
  * Vue.js
  * Vuetify
  
**Back-end**
  * Java 11
  * MySQL 5.7

**Tools**
  * Eclipse (Spring Framework 5.0)
  * apache/tomcat9.0
  * SQL developer
  * Github
  
## Vue.js + Spring Framework 연동을 위한 설정
  
* 이클립스 프로젝트 만들기
  
![dy](https://user-images.githubusercontent.com/64389409/99224157-21c10480-2829-11eb-8085-2d5c99092084.PNG)
![ma](https://user-images.githubusercontent.com/64389409/99224156-208fd780-2829-11eb-8a1e-1f121485a35d.PNG)  
  
* Vue.js 설치
  
[node.js](https://nodejs.org/kr/) 에서 npm 을 설치한다.
  

```npm
npm install -g @vue/cli
```
  
Vue 프로젝트를 생성하기 위해 vue-cli 를 설치한다.
    
```
vue create front
```
  
스프링 프로젝트 경로에서 vue 프로젝트를 생성한다. front 는 사용할 프로젝트명이다.
  
<img src="https://user-images.githubusercontent.com/64389409/99527372-09471a80-29e0-11eb-9ff3-5c17544434e0.PNG" width="30%" heigth="30%">
  
#### Vue.js + spring 연동을 위해서는 Vue 서버에서 Proxy 설정이 필요하다.
Vue 와 Spring 은 서버가 다르기 때문에 포트도 두개로 나뉜다.  
그렇기 때문에 vue 서버에 proxy 설정으로 Spring 요청을 Vue 서버에서 받고 Spring 으로 보내주도록 설정해준다.
  
```vue.js
// vue.config.js
module.exports = {  
  devServer: {
	  proxy: {
		  '/api': {
			  target: 'http://localhost:8081',
			  ws: true,
			  changeOrigin: true
		  },
	  }
  }
}
```
먼저 front 폴더 아래에 vue.config.js 를 만들어준다.  
그리고 Vue 포트는 8080 이고 Spring 은 8081 포트를 사용하기로 한다.  
그러면 Vue 에서 localhost:8080/api 으로 url 요청을 보내면 Spring 서버 localhost:8081 로 돌려준다.  


  

  
