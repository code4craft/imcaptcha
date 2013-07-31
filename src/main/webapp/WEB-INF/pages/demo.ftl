<#setting url_escaping_charset='utf-8'>

<!DOCTYPE html>






<html class="G_N">
<head>
    <meta charset="UTF-8"/><title>大众点评网</title>
    <script>document.documentElement.className=location.hash?'J_H':'';var G_rtop=+new Date,_gaq=[
        ['_setAccount','UA-464026-1'],
        ['_addOrganic','soso','w'],
        ['_addOrganic','sogou','query'],
        ['_addOrganic','yodao','q'],
        ['_addOrganic','bing','q'],
        ['_addOrganic','360','q'],
        ['_addOrganic','gougou','search'],
        ['_setDomainName', '.dianping.com'],
        ['_setAllowHash', false]],dpga=function(key){_gaq.push(['_trackPageview', key||''])},pageTracker={_trackPageview:dpga},_hip=[
        ['_setPageId', 52],
        ['_setCityId', 1],
        ['_setShopType', 0],
        ['_setPVInitData', {p_render:+(new Date)-G_rtop,hkw:4}]
    ];</script>
    <script>(function(n){var e;e="http://hls.dianping.com/jserror.gif",n.onerror=function(n,o,r){var i=encodeURIComponent,t=Date.now();(new Image).src=e+"?error="+i(n)+"&file="+i(o)+"&line="+i(r)+"&timestamp="+t}})(window);</script>

    <script src="/static/distort.js"></script>
    <link rel="Shortcut Icon" href="http://i2.dpfile.com/s/res/favicon.5ff777c11d7833e57e01c9d192b7e427.ico" type="image/x-icon" />
    <link rel="stylesheet" href="http://i1.dpfile.com/s/c/app/main/base-old.min.d030f4448404302ba137205679dd725c.css" type="text/css" />
    <link rel="stylesheet" href="http://i1.dpfile.com/s/c/app/account/login.min.b4ddfec3b82c9fc49a2ff1f0ba1586b3.css" type="text/css" />


</head>
<body id="top">

<div class="header-bar">
    <div class="inner Fix">
        <span class="tagline">爱生活，爱点评！</span>
        <ul class="user-action hd-menu">
            <li class="user-login first mi">
                <a href="http://www.dianping.com/login" rel="nofollow"  onclick="pageTracker._trackPageview('dp_head_login_shanghai');"><span>请登录</span></a>
            </li>
            <li class="user-signup mi">
                <a href="http://www.dianping.com/reg" rel="nofollow"  onclick="pageTracker._trackPageview('dp_head_reg_shanghai');"><span>快速注册</span></a>
            </li>
            <li class= "user-signup mi">
                <a href="http://www.dianping.com/reservation/main/reserveSearch" target="_blank" rel="nofollow" onclick="pageTracker._trackPageview('dp_head_reserve_shanghai');"><span> 我的订座 </span></a>
            </li>
        </ul>
        <ul class="quick-menu hd-menu">
            <li class="first mi"><a href="http://www.dianping.com">点评网首页</a></li>
            <li class="mi"><a href="http://www.dianping.com/promo/shanghai">优惠券</a></li>
            <li class="mi"><a href="http://t.dianping.com/shanghai">团购</a></li>
            <li class="mi"><a href="http://q.dianping.com">签到</a></li>
            <li class="mi"><a href="http://www.dianping.com/card/shanghai">会员卡</a></li>
            <li class="mi"><a href="http://s.dianping.com/shanghai/group">社区</a></li>
            <li class="mi"><a href="http://www.dianping.com/events/m/index.htm">手机版</a></li>
        </ul>
    </div>
</div>

<!-- 顶部logo -->
<div class="header">
    <a class="logo" href="/" title="大众点评网" onClick=""><img src="http://i3.dpfile.com/s/res/betalogo.3927ee6154a2e5294176fdda742b4e59.png" alt="大众点评网"></a>
</div>

<form method="post" id="J_login-form">

    <!-- 提示框 -->
    <div class="main-top">
        <p class="login-switch">还没有帐号？<a href="/reg">立即注册</a></p>
        <div class="page-title">
            <strong class="title-main">会员登录，欢迎回到大众点评！</strong>
        </div>
    </div>

    <!-- 主题内容 -->
    <div class="main page-sa Fix">

        <input type="hidden" name="checkCapchaCode" value="true"/>
        <input type="hidden" name="postBack" value="true"/>

        <div class="section">
            <div id="cont-log" class="block login-form">
                <div class="form-block">
                    <label for="J_usrname" class="label">帐号：</label>
                    <input name="username" type="text" value="13636434094" id="J_usrname" tabindex="1" class="form-txt form-txt-l username" size="30" />
                    <span class="form-msg-box mb-error fv_username Hide" id="J_fv-usrname"></span>
                    <div class="form-content-block form-note-block">
                        <span class="note">可使用邮箱、手机号登录</span>
                    </div>
                </div>

                <!--两种不同错误提示的情况-->
                <div class="form-block">
                    <label for="J_pwd" class="label">密码：</label>
                    <input name="password" type="password" id="J_pwd" tabindex="2" class="form-txt form-txt-l password" size="30" />
                    <span class="form-msg-box mb-error fv_password Hide" id="J_fv-pwd"></span>
                    <div class="form-content-block form-note-block">
                        <span class="note"><a href="/resetpassword">忘记密码</a></span>
                    </div>
                </div>

                <div class="form-block" id="ctl00_PlaceHolderPage_divCapchaCode">
                    <span class="label">验证码：</span>
                    <div><canvas id="q" width="140" height="40"></canvas></div>
                    <span class="form-msg-box mb-error fv_validate Hide" id="J_fv-validate"></span>
                </div>

                <div class="form-block">
                    <div class="form-content-block chk-unit form-note-block">
                        <input id="J_cookie" type="checkbox" name="keepLogin"><label for="J_cookie">一个月之内免登录</label>
                    </div>
                    <div class="form-content-block chk-unit form-note-block provision">
                        <input id="agreeprovision" type="checkbox" name="" checked="checked"><label for="agreeprovision">我已看过并同意大众点评网<a target="_blank" href="http://www.dianping.com/aboutus/useragreement">《用户使用协议》</a></label>
                    </div>
                </div>

                <div class="block form-btn-block form-block form-content-block form-btn-static">
                    <strong class="btn-type-c btn-fn-e">
                        <input type="submit" name="login" value="登 录" id="J_login-btn" tabindex="4" class="form-btn" />
                    </strong>
                </div>
            </div>
        </div>

        <div class="aside aside-right">

            <div class="block b-ids" style="zoom:1">
                <div class="block-title">您也可以使用下列帐号登录大众点评：</div>
                <ul style="height: 50px; ">

                    <li>
                <span class="id-qq">
                    <a href="#" name="btQQLogin" value="腾讯QQ登录" id="btQQLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_QQ');">QQ帐号</a>
                </span>
                    </li>

                    <li>
                <span class="id-renren">
                    <a href="#" name="xn_login_image" value="人人网帐号" id="btRenLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_renren');">人人网帐号</a>

                </span>
                    </li>

                    <li>
                <span class="id-weibo">
                    <a href="#" name="btSinaLogin" value="新浪微博帐号" id="btSinaLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_sina');">新浪微博帐号</a>
                </span>
                    </li>

                    <li>

                <span class="id-kaixin">
                    <a href="#" name="btKaiLogin" value="开心网帐号" id="btKaiLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_kaixin');">开心网帐号</a>
                </span>
                    </li>

                    <li>
                <span class="id-alipay">
                    <a href="#" name="btAliPayLogin" value="支付宝帐号" id="btAliPayLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_alipay');">支付宝登录</a>
                </span>

                    </li>

                    <li>
                <span class="id-sohu">
                    <a href="#" name="btSohuLogin" value="搜狐微博帐号" id="btSohuLogin" onclick="pageTracker._trackPageview('dp_thirdlogin_sohu');">搜狐微博帐号</a>
                </span>
                    </li>

                    <li>
                <span class="id-360">

                    <a href="#" name="bt360Login" value="360帐号" id="bt360Login" onclick="pageTracker._trackPageview('dp_thirdlogin_360');">360帐号</a>
                </span>
                    </li>

                    <li>
                <span class="id-baidu">
                    <a href="#" name="btHao123Login" value="百度帐号" id="btHao123Login" onclick="pageTracker._trackPageview('dp_thirdlogin_baidu');">百度帐号</a>
                </span>
                    </li>

                </ul>
                <a title="展开" href="javascript:;" class="b-ids-toggle ">展开/收起</a>
            </div>

        </div>
    </div>

</form>

<div class="footer footer-static">
    <div class="tuan-nav" style="display:none">
        <dl>
            <dt>华北东北：</dt>
            <dd>
                <a href="http://t.dianping.com/beijing" target="_blank">北京团购</a><a href="http://t.dianping.com/tianjin" target="_blank">天津团购</a><a href="http://t.dianping.com/shenyang" target="_blank">沈阳团购</a><a href="http://t.dianping.com/dalian" target="_blank">大连团购</a><a href="http://t.dianping.com/changchun" target="_blank">长春团购</a><a href="http://t.dianping.com/haerbin" target="_blank">哈尔滨团购</a><a href="http://t.dianping.com/shijiazhuang" target="_blank">石家庄团购</a><a href="http://t.dianping.com/taiyuan" target="_blank">太原团购</a>
            </dd>
        </dl>
        <dl>
            <dt>华东地区：</dt>
            <dd>
                <a href="http://t.dianping.com/shanghai" target="_blank">上海团购</a><a href="http://t.dianping.com/hangzhou" target="_blank">杭州团购</a><a href="http://t.dianping.com/nanjing" target="_blank">南京团购</a><a href="http://t.dianping.com/suzhou" target="_blank">苏州团购</a><a href="http://t.dianping.com/wuxi" target="_blank">无锡团购</a><a href="http://t.dianping.com/changzhou" target="_blank">常州团购</a><a href="http://t.dianping.com/jinan" target="_blank">济南团购</a><a href="http://t.dianping.com/xiamen" target="_blank">厦门团购</a><a href="http://t.dianping.com/ningbo" target="_blank">宁波团购</a><a href="http://t.dianping.com/fuzhou" target="_blank">福州团购</a><a href="http://t.dianping.com/qingdao" target="_blank">青岛团购</a><a href="http://t.dianping.com/hefei" target="_blank">合肥团购</a>
            </dd>
        </dl>
        <dl>
            <dt>中部西部：</dt>
            <dd>
                <a href="http://t.dianping.com/wuhan" target="_blank">武汉团购</a><a href="http://t.dianping.com/zhengzhou" target="_blank">郑州团购</a><a href="http://t.dianping.com/changsha" target="_blank">长沙团购</a><a href="http://t.dianping.com/nanchang" target="_blank">南昌团购</a><a href="http://t.dianping.com/chengdu" target="_blank">成都团购</a><a href="http://t.dianping.com/chongqing" target="_blank">重庆团购</a><a href="http://t.dianping.com/xian" target="_blank">西安团购</a>
            </dd>
        </dl>
        <dl>
            <dt>华南地区：</dt>
            <dd>
                <a href="http://t.dianping.com/guangzhou" target="_blank">广州团购</a><a href="http://t.dianping.com/shenzhen" target="_blank">深圳团购</a><a href="http://t.dianping.com/dongguan" target="_blank">东莞团购</a>
            </dd>
        </dl>
        <p class="note"><a href="http://t.dianping.com/subscribe/future" target="_blank">没有你的城市？</a></p>
    </div>

    <ul>
        <li><a target="_blank" href="http://www.dianping.com/aboutus" rel="nofollow">关于大众点评</a>|</li>
        <li><a target="_blank" href="http://s.dianping.com/topic/2815561" rel="nofollow">诚信公约</a>|</li>
        <li><a target="_blank" href="http://www.dianping.com/help" rel="nofollow">网站帮助</a>|</li>
        <li><a target="_blank" href="http://www.dianping.com/business/" rel="nofollow">推广服务</a>|</li>
        <li><a target="_blank" href="http://www.dianping.com/aboutus/media" rel="nofollow">媒体报道</a>|</li>
        <li><a target="_blank" href="http://careers.dianping.com" rel="nofollow">人才招聘</a>|</li>
        <li><a target="_blank" href="http://www.dianping.com/forum" rel="nofollow">站务论坛</a>|</li>
        <li><a target="_blank" href="http://www.dianping.com/contactus" rel="nofollow">联系我们</a>|</li>
        <li><a target="_blank" href="http://developer.dianping.com" rel="nofollow">开发者</a>|</li>
        <li class="fn-tuan"><a href="javascript:;" onclick="return false;">点评团</a></li>
    </ul>
    <p>&copy;2003-2013 dianping.com, All Rights Reserved.　　本站发布的所有内容，未经许可，不得转载，详见<a href="http://www.dianping.com/aboutus/zhishichanquan.html" rel="nofollow">《知识产权声明》</a>。</p>
</div>
<textarea class="J_auto-load">
</textarea>
<script>
    var __loaderConfig={appBase:'s/j/app/',libBase:'lib/1.0/',server:'i{n}.dpfile.com'};
</script>
<script src="http://i1.dpfile.com/lib/1.0/neuron-active.min.8baf626bdc0ab3e655066c3e4373fdde.js"></script><script>DP.data({cityEnName:'shanghai'});DP.load("http://i3.dpfile.com/x_x/version.min.v1374491428728.js");DP.require('Main::header');DP.load('http://i1.dpfile.com/s/res/ga.min.bd65c7c2a3a896ef5903739c021bb277.js');</script>
<script>DP.ready(function(){function c(a){a.option({startDate:new Date(2013,2,26),life:14,closevent:function(){b(".pp_ipad-hint",-40),b(".ep-mobile-hint",-40)}}).show('\u8bda\u4fe1\u7cfb\u7edf\u518d\u8fce\u5927\u5347\u7ea7\uff0c<a class="B" href="http://s.dianping.com/topic/6049131" target="_blank">\u67e5\u770b\u8be6\u60c5\u3002</a>')} var a=!window.Bulletin,b=a?function(){}:function(a,b){var c=$$(a)[0];if(c){b=b||0;var d=parseInt(c.getStyle("top"));c.setStyle("top",d-b)}};a?DP.provide("Main::bulletin",function(a,b){c(b)}):(c(Bulletin),b(".pp_ipad-hint",40),b(".ep-mobile-hint",40));});</script>
<script type="text/javascript">
    ;(function (D){

        D.data({
            redirUrl: '',
            riskhint: false
        });

        D.require('Account::login');
        D.provide(['form/form', 'Account::thirdpart', 'Account::toggle']);

        D.ready(function(){dpga()});

    })(DP);

</script><script>

    pageTracker._trackPageview("dp_head_shanghai");
    pageTracker._trackPageview("dp_tongji_shanghai");

    $pi={"cid":1,"cn":"shanghai","nid":999,"rc":0,"nn":"Index"};</script>
<script type="text/javascript">var $pei={"w":"10.1032","s":"locked","c":"locked\r\n","q":"locked","i":"128"}</script>
</body>
</html>