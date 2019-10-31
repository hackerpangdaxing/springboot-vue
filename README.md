#  springboot-vue 分页查询小案例（idea初始化搭建vue环境）

## 需要先安装好nodejs和npm

## 输入下面的命令查看是否成功安装
```
node -v
npm -v
```

一、开始

```
# 工作目录：IdeaProjects
# 使用idea新建Static Web项目：vue-demo

# 在demo目录下新建node_modules文件夹
# 因为后面node_modules中的内容太多，并且我们不会用到，所以在idea中右键该文件夹，选择Mark Directory as - Excluded

# 打开命令提示符
# 首先安装使用淘宝npm镜像：

npm i -g cnpm --registry=https://registry.npm.taobao.org
# 如果权限不够，请使用管理员运行命令提示符

# 安装vue-cli，vue脚手架：

cnpm i -g vue-cli
# 测试是否安装成功：

vue -V
```
二、安装

 

```
# 进入我们的工作目录：

cd ~/IdeaProjects/
# 使用脚手架安装项目：

vue init webpack vue-demo
 
# 提示目录已存在，是否继续：Y
Project name（工程名）:justin-vue 回车
Project description（工程介绍）：回车
Author：作者名
Vue build（是否安装编译器）:回车
Install vue-router（是否安装Vue路由）：回车
Use ESLint to lint your code（是否使用ESLint检查代码，我们使用idea即可）：n
Set up unit tests（安装测试工具）：n
Setup e2e tests with Nightwatch（也是测试相关）：n
Should we run `npm install` for you after the project has been created? (recommended)：选择：No, I will handle that myself
 
```
三、初始化

 

```
# 进入项目目录：

cd vue-demo
# 初始化项目：

cnpm i
# 运行项目：

cnpm run dev
# 浏览器打开：localhost:8080，即可看到vue项目

Ctrl+C退出运行

 

# 安装项目依赖,分别是scss支持，ajax工具，element ui，两个兼容包

 
cnpm i node-sass -D
cnpm i sass-loader -D

cnpm i axios -D

cnpm i element-ui -D

cnpm i babel-polyfill -D

cnpm i es6-promise -D
 
 

# 配置idea

File - Settings - Languages&Frameworks - JavaScript：修改JavaScript language version为ECMAScript 6，确认
File - Settings - Plugins：搜索vue，安装Vue.js
Run - Edit Configurations...：点击加号，选择npm，Name为Dev，package.json选择你工程中的package.json，Command为run，Scripts为dev,然后就可以直接在idea中运行了。
# 继续点击加号，选择npm，Name为Build，package.json选择你工程中的package.json，Command为run，Scripts为build,然后就可以直接在idea中打包了。

 

修改项目配置

# 修改/config/index.js文件，找到

port: 8080
# 修改为
port: 8070
productionSourceMap: true
# 修改为
productionSourceMap: false
 

# 修改/build/webpack.base.conf.js文件，找到

 
module.exports = {
  entry: {
    app: './src/main.js'
  },
修改为
module.exports = {
  entry: {
    app: ['babel-polyfill', './src/main.js']
  },
 
 

# 最后在src/main.js中加入

 
import 'es6-promise/auto'
import promise from 'es6-promise'
import Api from './api/index.js'
import Utils from './utils/index.js'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.prototype.$utils = Utils;
Vue.prototype.$api = Api;
Vue.use(ElementUI);
 
# 这样，一个差不多完整的vue项目就ok啦，并且可以在idea中编辑和运行。

# 注：使用static里的文件尽量使用绝对路径，如/static/image/background.png 使用src里的文件则尽量使用相当路径。

```

## 基于springboot-vue前后端完整分页查询源码

```
https://github.com/hackerpangdaxing/springboot-vue
```