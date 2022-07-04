# idea-notification

![Build](https://github.com/1163895390wjh/idea-notification/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

此插件想做两个功能适用于jetbrains系列

-  [] 1.提交代码前做检查，弹确认框提醒功能
-  [] 2.模板字符串双引号或单引号自动转换反引号功能


关于第一个功能：
由于经常会出现忘记切换分支，在发布分支上提交不该提交的代码，所以想做个插件，在设定的分支上commit或push前消息框提醒。

关于第二个功能：
想把VS Code的一个插件功能移植过来，因为在webstorm上暂时没找到对应的插件，当你在一个单引号或者双引号的字符串中输入${时，会自动把字符串两头的单引号或双引号转为反引号\`
