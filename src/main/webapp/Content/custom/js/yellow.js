//获取表单Json对象
$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        }
        else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

// 根据时间返回时间字符串"2015-06-11"
function getDate(date) {
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    return year + "-" + month + "-" + day;
}

// 根据时间返回时间字符串"2015-06-11 12:48:16"
function getDateTime(date) {
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    var hh = date.getHours();
    var mm = date.getMinutes();
    var ss = date.getSeconds();
    return year + "-" + month + "-" + day + " " + hh + ":" + mm + ":" + ss;
}

// 获取QueryString的数组
function getQueryString() {
    var result = location.search.match(new RegExp("[\?\&][^\?\&]+=[^\?\&]+", "g"));
    for (var i = 0; i < result.length; i++) {
        result[i] = result[i].substring(1);
    }
    return result;
}

// 根据QueryString参数名称获取值
function getQueryStringByName(name) {
    var result = location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
    if (result == null || result.length < 1) {
        return "";
    }
    return result[1];
}

// 根据QueryString参数索引获取值
function getQueryStringByIndex(index) {
    if (index == null) {
        return "";
    }

    var queryStringList = getQueryString();
    if (index >= queryStringList.length) {
        return "";
    }

    var result = queryStringList[index];
    var startIndex = result.indexOf("=") + 1;

    result = result.substring(startIndex);
    return result;
}

// 添加一个cookie
function setCookie(name, value, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires=" + d.toGMTString(); // d.toUTCString();
    document.cookie = name + "=" + encodeURIComponent(value) + "; " + expires;
}

// 根据名字获取Cookie
function getCookie(name) {
    var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr = document.cookie.match(reg)) return decodeURIComponent(arr[2]);
    else return null;
}

// 根据名字删除Cookie
function delCookie(name) {
    var exp = new Date();
    exp.setTime(exp.getDate() - 1);
    var cval = getCookie(name);
    if (cval != null) document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString() + "; path=/";
}

function getJsonObj(jsonStr) {
    return eval('(' + jsonStr + ')');
}

// function getRootPath() {
// //获取当前网址，如： http://localhost:8080/ems/Pages/Basic/Person.jsp
// var curWwwPath = window.document.location.href;

// //获取主机地址之后的目录，如： /ems/Pages/Basic/Person.jsp
// var pathName = window.document.location.pathname;
// var pos = curWwwPath.indexOf(pathName);

// //获取主机地址，如： http://localhost:8080
// var localhostPath = curWwwPath.substring(0, pos);
// //获取带"/"的项目名，如：/ems
// //var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') +
// 1);

// return localhostPath;
// }

// 根据当前Url获取根路径
function getRootPath(currentUrl) {
    var curWwwPath = window.document.location.href;
    var pos = curWwwPath.indexOf(currentUrl);
    var localhostPath = curWwwPath.substring(0, pos);
    return localhostPath;
}

// 自定义BootStrap警告框
function bootStrapAlert(elementId, insertType, alertType, alertContent, fadeOutTime) {
    // 拼接警告框字符串
    var alertString = "<div id=\"myAlert\" class=\"alert";
    switch (alertType) {
        case "success":
            alertString += " alert-success";
            break;
        case "info":
            alertString += " alert-info";
            break;
        case "warning":
            alertString += " alert-warning";
            break;
        case "danger":
            alertString += " alert-danger";
            break;
        default:
            alertString += " alert-info";
            break;
    }

    alertString += " alert-dismissible  \" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button><strong>";
    alertString += alertContent;
    alertString += "</strong></div>";

    // 显示处理好的警告框（表示是在元素前中后哪个位置插入）
    if (insertType == "append") {
        $('#' + elementId).append(alertString);
    }
    else if (insertType == "before") {
        $('#' + elementId).before(alertString);
    }
    else if (insertType == "after") {
        $('#' + elementId).after(alertString);
    }

    // 添加警告框关闭效果
    if (fadeOutTime != null && fadeOutTime!='')
    {
        if (fadeOutTime >= 0) {
            $('.alert').fadeOut(fadeOutTime, function () {
                $('.alert').alert('close');
            });
        }
    }
    else {
        //默认3秒关闭
        $('.alert').fadeOut(3000, function () {
            $('.alert').alert('close');
        });
    }
}

// 删除Model窗弹出
function confirmDelete(rId) {
    $('#deleteRecordId').val(rId);
    $('#myDeleteModal').modal();
}

// 根据类型和值获取中文解释
function getTypeNameByValue(type, value) {
    switch (type) {
        // 是或否
        case "YesOrNo": {
            switch (value) {
                case "0":
                    return "否";
                case "1":
                    return "是";
                default:
                    return value;
            }
        }
            // 是否处置
        case "IsDisposal": {
            switch (value) {
                case "0":
                    return "未处置";
                case "1":
                    return "已处置";
                default:
                    return value;
            }
        }
            // 启用或停用
        case "IsEnable": {
            switch (value) {
                case "0":
                    return "停用";
                case "1":
                    return "启用";
                default:
                    return value;
            }
        }

            // 状态表示
        case "Status": {
            switch (value) {
                case "0":
                    return "禁用";
                case "1":
                    return "正常";
                default:
                    return value;
            }
        }

            // 预警等级
        case "AlarmGrade": {
            switch (value) {
                case "0":
                    return "事件";
                case "1":
                    return "预警";
                default:
                    return value;
            }
        }
            // 是否智能锁预警
        case "IsSealAlarm": {
            switch (value) {
                case "0":
                    return "否";
                case "1":
                    return "是";
                case "2":
                    return "共有";
                default:
                    return value;
            }
        }
            // 智能锁状态
        case "ESealStatus": {
            switch (value) {
                case "0":
                    return "丢失报废";
                case "1":
                    return "使用中";
                case "2":
                    return "备用中";
                case "3":
                    return "维修中";
                case "4":
                    return "待维修";
                default:
                    return value;
            }
        }
            // 智能锁版本
        case "SealType": {
            switch (value) {
                case "1":
                    return "二代锁";
                case "2":
                    return "三代锁";
                default:
                    return value;
            }
        }
            // 智能锁类型
        case "SealDetailType": {
            switch (value) {
                case "1":
                    return "一体式";
                case "2":
                    return "分体式";
                default:
                    return value;
            }
        }
            // 图片类型
        case "ImageCustomType": {
            switch (value) {
                case "VehicleImage":
                    return "车辆图片";
                case "VehicleIcon":
                    return "车辆图标";
                case "ConIcon":
                    return "箱类型图标";
                default:
                    return value;
            }
        }
            // 用户类型
        case "UserType": {
            switch (value) {
                case "0":
                    return "海关管理员";
                case "1":
                    return "系统管理员";
                case "2":
                    return "普通用户";
                case "3":
                    return "码头用户";
                case "4":
                    return "闸口用户";
                default:
                    return value;
            }
        }
            // 是否标识
        case "NeedEdit": {
            switch (value) {
                case "0":
                    return "已标识";
                case "1":
                    return "未标识";
                default:
                    return value;
            }
        }
            // 是否标识
        case "ConSize": {
            switch (value) {
                case "20":
                    return "20";
                case "40":
                    return "40";
                default:
                    return "自定义";
            }
        }

            // 企业状态
        case "EntState": {
            switch (value) {
                case "0":
                    return "未审批";
                case "1":
                    return "已审批";
                case "2":
                    return "已禁用";
                default:
                    return value;
            }
        }

            // sim状态
        case "SimState": {
            switch (value) {
                case "0":
                    return "完全禁用";
                case "1":
                    return "正常";
                case "2":
                    return "前置机屏蔽";
                case "3":
                    return "不往运营商传输";
                default:
                    return value;
            }
        }

            // 定位设备传输状态
        case "DeviceModelState": {
            switch (value) {
                case "0":
                    return "完全禁用";
                case "1":
                    return "正常";
                case "2":
                    return "前置机屏蔽";
                case "3":
                    return "不向运营商传输";
                default:
                    return value;
            }
        }

            // 定位设备传输状态
        case "EFFlag": {
            switch (value) {
                case "0":
                    return "空";
                case "1":
                    return "重";
                default:
                    return value;
            }
        }
        
        // TTS状态
        case "TtsStatus": {
            switch (value.toString()) {
                case "0":
                    return "初始状态";
                case "1":
                    return "已发送";
                case "2":
                    return "已送达";
                case "-1":
                    return "发送失败";
                case "-2":
                    return "消息有误";
                case "-3":
                    return "不支持";
                default:
                    return value;
            }
        }

        default:
            return value;
    }
}

function getSpeedStr(speed) {
    if (speed == null || speed == "") speed = "-";
    return speed + " km/h"
}

function getDirectionStr(direction) {
    if (direction == null || direction == "") return "-";
    direction = direction % 360;
    if (direction >= 0 && direction < 22.5) return "北";
    else if (direction >= 22.5 && direction < 67.5) return "东北";
    else if (direction >= 67.5 && direction < 112.5) return "东";
    else if (direction >= 112.5 && direction < 157.5) return "东南";
    else if (direction >= 157.5 && direction < 202.5) return "南";
    else if (direction >= 202.5 && direction < 247.5) return "西南";
    else if (direction >= 247.5 && direction < 292.5) return "西";
    else if (direction >= 292.5 && direction < 237.5) return "西北";
    else if (direction >= 237.5 && direction < 360) return "北";
    else return "-";
}

function openIntegrationPage(vehicleSim, vehicleVoyage, conId, sealId, sealNumber) {
    var myTop = (screen.height - 700 - 50) / 2;
    var myLeft = (screen.width - 1300) / 2;
    var myString = "height=700,width=1300,top=" + myTop + ",left=" + myLeft + ",toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no";
    var myUrl = "/Monitor/IntegrationViewer?VehicleSim=" + vehicleSim + "&Voyage1=" + vehicleVoyage + "&SealID1=" + sealId + "&ConID1=" + conId + "&SealNumber1=" + sealNumber;
    window.open(myUrl, '智能锁集成信息查询页面', myString);
}

/* 根据权限构建系统菜单 */
function generateMenuHtml(menuList, baseUrl) {
	baseUrl = baseUrl.substring(0,baseUrl.length-1);
    var menuSb = new StringBuilder();
    //添加首页按钮
    menuSb.append('<li><a href="'+baseUrl+'" target="_blank"><span class="glyphicon glyphicon-home" aria-hidden="true" style="font-size:16px;"></span>&nbsp;&nbsp;首页</a></li>');
    
    var topMenuArray = new Array();

    // 取得顶级目录信息
    for (var i = 0; i < menuList.length; i++) {
        if (menuList[i].parentId == 'PARENT') {
            topMenuArray.push(menuList[i]);
        }
    }

    // 依次构造每个顶级目录及其下属目录Html
    for (var i = 0; i < topMenuArray.length; i++) {
        var topMenuSb = new StringBuilder();
        // 判断是否有子菜单，如果有则构造
        if (haveChildren(topMenuArray[i].id, menuList)) {
            topMenuSb.append("<li class=\"dropdown\">");
            topMenuSb.append("<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">");
            topMenuSb.append("<span class=\"");
            topMenuSb.append(getTopMenuIconString(topMenuArray[i].menuName));
            topMenuSb.append("\" aria-hidden=\"true\" style=\"font-size:16px;\"></span>&nbsp;&nbsp;");
            topMenuSb.append(topMenuArray[i].menuName);
            topMenuSb.append("&nbsp;&nbsp;<span class=\"caret\"></span></a>");
            topMenuSb.append("<ul class=\"dropdown-menu head-menu\" role=\"menu\">");
            topMenuSb.append(generateCommonMenuHtml(topMenuArray[i], menuList, baseUrl ));
            topMenuSb.append("</ul></li>");
        }
        menuSb.append(topMenuSb.toString());
    }

    return menuSb.toString();
}

function generateCommonMenuHtml(parentMenuInfo, menuList, baseUrl) {
    var menuSb = new StringBuilder();
    var menuArray = new Array();

    // 取得当级目录信息
    for (var i = 0; i < menuList.length; i++) {
        if (menuList[i].parentId == parentMenuInfo.id) {
            menuArray.push(menuList[i]);
        }
    }

    // 依次构造当级目录及其下属目录html
    for (var i = 0; i < menuArray.length; i++) {
        var commonMenuSb = new StringBuilder();
        // 判断是否有子菜单，如果有则构造
        if (haveChildren(menuArray[i].id, menuList)) {
            commonMenuSb.append("<li class=\"dropdown-submenu\"><a href=\"#\">");
            commonMenuSb.append(menuArray[i].menuName);
            commonMenuSb.append("<span class=\"glyphicon glyphicon-triangle-right submenu-triangle\" aria-hidden=\"true\"></span></a>");
            commonMenuSb.append("<ul class=\"dropdown-menu\">");
            commonMenuSb.append(generateCommonMenuHtml(menuArray[i], menuList, baseUrl));
            commonMenuSb.append("</ul></li>");
        }
        else {
            commonMenuSb.append("<li><a href=\"");
            commonMenuSb.append(baseUrl + menuArray[i].url);
            commonMenuSb.append("\">");
            commonMenuSb.append(menuArray[i].menuName);
            commonMenuSb.append("</a></li>");
        }
        menuSb.append(commonMenuSb.toString());
    }

    return menuSb.toString();
}

function haveChildren(menuId, menuList) {
    var result = false;
    for (var i = 0; i < menuList.length; i++) {
        if (menuList[i].parentId == menuId) {
            result = true;
            break;
        }
    }
    return result;
}

function getTopMenuIconString(menuName) {
    switch (menuName) {
        case "智能监控":
            return "glyphicon glyphicon-globe";
        case "报表统计":
            return "glyphicon glyphicon-stats";
        case "货运服务":
            return "glyphicon glyphicon-tasks";
        case "备案维护":
            return "glyphicon glyphicon-pencil";
        case "审批管理":
            return "glyphicon glyphicon-check";
        case "系统管理":
            return "glyphicon glyphicon-cog";
        default:
            return "glyphicon glyphicon-globe";
    }
}

function showLoading(content) {
    var loadingBg = $("#loading-bg");
    var loadingBar = $("#loading-bar");
    loadingBg.height($(window).height());
    loadingBg.width($(window).width());
    if (content != '') loadingBar.text(content);
    loadingBg.show();
    loadingBar.show();
}

function hideLoading() {
    $("#loading-bg").hide();
    $("#loading-bar").hide();
}

function isDate(dateTime){
        if (dateTime == null || dateTime == "" || dateTime == undefined) {
                return true;
        }
        var reg = /^((\d{2}(([02468][048])|([13579][26]))[\-\/\s]?((((0?[13578])|(1[02]))[\-\/\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\-\/\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\-\/\s]?((0?[1-9])|([1-2][0-9])))))|(\d{2}(([02468][1235679])|([13579][01345789]))[\-\/\s]?((((0?[13578])|(1[02]))[\-\/\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\-\/\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\-\/\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\s((([0-1][0-9])|(2?[0-3]))\:([0-5]?[0-9])((\s)|(\:([0-5]?[0-9])))))?$/;     
        var r = dateTime.match(reg);     
        if(r==null) {
                return false;
        }
        else {
                return true;
        }
}

function isTime(time){
        var reg = /^(([01]?[0-9])|(2[0-3])):[0-5]?[0-9]$/;     
        var r = time.match(reg);     
        if(r==null) {
                return false;
        }
        else {
                return true;
        }
}


var  export_max_records_total = 5000;

//jQuery.validator  修改date验证 格式（YYYY-MM-DD hh:mm:ss)
$.validator.methods.date = function (value, element) {
    var matches = /(\d{4}|\d{2})-((1[0-2])|(0?[1-9]))-(([12][0-9])|(3[01])|(0?[1-9]))\s((1|0?)[0-9]|2[0-3]):([0-5][0-9])/.exec(value);
    if (matches == null) return this.optional(element)|| false;
    return this.optional(element) || true;
};

$.fn.modal.Constructor.prototype.enforceFocus = function () { };