**🎓基于 Spring Boot + Vue 的排课系统✨**

**一、项目简介**

  🌟本排课系统基于 Spring Boot 和 Vue 技术栈精心打造，旨在完美解决教育机构排课过程中效率低下、资源浪费等棘手问题。通过该系统，能够实现科学合理的课程安排，巧妙优化教学资源配置，极大提升教学管理效率，为教育机构提供高效且贴心的教学管理解决方案。

**二、技术栈**

**后端**

  💪Spring Boot 框架，如同一位强大的幕后英雄，用于快速构建独立的、生产级别的 Spring 应用程序。它具备自动配置的神奇魔力，能减少大量样板代码，让开发变得轻松便捷，实现快速启动，还拥有丰富的依赖管理功能。

**前端**

  🌐Vue.js 框架，以其体积小、数据自动更新的卓越特性脱颖而出，具备高复用性，易于测试和扩展，代码结构清晰明了。同时结合 Ant Design Vue 提供的丰富 UI 组件，以及 FullCalendar 实现的强大日历相关功能，为用户带来极致的视觉体验。

**数据库**

  💾MySQL，作为开源的关系型数据库管理系统，拥有快速查询的超凡能力，能确保数据一致性，实现高效的并发控制，且语法简单易懂。

**开发模式**

  🚀前后端分离模式，让前端专注于用户界面的精美设计，后端专注于业务逻辑的深度处理，大大提高开发效率，便于独立开发和测试。

**三、功能介绍**

**用户管理**

  👥超级管理员拥有强大的管理权限，可进行用户的增删改查操作，支持批量导入用户信息，还能精细管理用户角色和权限，确保系统安全有序运行。

**课程管理**

  📚支持新建课程，可进行合并上课设置，具备课程冲突检查功能，让课程安排更加科学合理。同时，可对已有课程进行灵活的编辑和删除操作。

**教师管理**

  👨‍🏫新增教师时进行查重，保证教师信息的准确性和唯一性。可对教师信息进行编辑和删除操作，轻松管理教师资源。

**直播间管理**

  🎥实现直播间的新增、编辑和删除功能，满足直播教学资源管理的多样化需求。

**排课管理**

**排课日历**

  🗓️可视化排课界面，操作便捷。可新建排课，进行冲突检测，已排课程可通过拖拽进行修改（冲突时会温馨提示并恢复原状），支持编辑但不可删除。
排课列表
  📋展示已排课程，可对课程信息进行编辑（冲突时会及时提示）和删除课程操作，方便排课人员进行管理。

**AI 排课助手**

  🤖在排课遇到困难时，AI 排课助手基于预设算法和知识库，为排课人员提供专业的排课建议和解决方案，让排课变得更加轻松。

**系统管理**

  ⚙️包括用户管理、角色管理和菜单管理，超级管理员可全面掌控系统设置，确保系统的安全性和稳定性。

**四、系统架构**

**前端层**

  🌈使用 Ant Design Vue、Vue.js 和 FullCalendar 精心构建用户界面，为用户带来美观、易用的操作体验。
	
**展示层**

  📺负责页面渲染以及处理 POST 和 GET 请求，确保数据的及时展示和交互。
	
**服务器层**

  🖥️Nginx 实现负载均衡和静态资源服务，Spring Boot 构建后端应用程序，为系统提供强大的支持。
	
**应用层**

  👨‍💼区分普通用户、普通管理员和超级管理员，赋予不同权限和功能，满足不同用户的需求。
	
**数据层**

  💽实现数据缓存和日志记录，提高数据访问速度，便于系统维护和问题排查。
	
**数据库**

  📊MySQL 存储系统各类数据，确保数据的安全和稳定。

**五、安装与部署**

**后端**

  1. 📥克隆项目代码到本地。
	
  2. 💻确保已安装 JDK 1.8 及以上版本、Maven。
	
  3. 📁进入后端项目目录，执行mvn clean install进行项目构建。
	
  4. 🚀构建成功后，执行java -jar target/项目名.jar启动后端服务。
	
**前端**

  1. 📂进入前端项目目录。
	
  2. 💻确保已安装 Node.js 和 npm。
	
  3. 📦执行npm install安装项目依赖。
	
  4. 🌟安装完成后，执行npm run serve启动前端服务。

**六、使用说明**

**登录**

  🔑在登录页面输入用户名和密码，验证通过后即可进入系统，开启高效排课之旅。
	
**功能操作**

  👨‍💻根据不同用户角色，在相应功能模块进行操作，如普通管理员进行课程管理、排课管理等，超级管理员进行系统管理，让系统的使用更加便捷和高效。

**功能扩展**

  📈增加教学评价、在线选课等功能模块，进一步完善教学管理功能，满足教育机构不断发展的需求。
