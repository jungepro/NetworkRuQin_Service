<template>
  <div id="userLayout" :class="['user-layout-wrapper', device]">
    <div class="container">
      <!--      <div class="top">-->
      <!--        <div class="header">-->
      <!--          <a href="/">-->
      <!--            <img src="~@/assets/logo.png" class="logo" alt="logo">-->
      <!--            <span class="title">网络入侵检测平台</span>-->
      <!--          </a>-->
      <!--        </div>-->
      <!--        <div class="desc">-->
      <!--        </div>-->
      <!--      </div>-->
      <route-view></route-view>
      <div class="footer">
        <div class="links">
        </div>
        <div class="copyright">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import RouteView from '@/components/layouts/RouteView'
import { mixinDevice } from '@/utils/mixin.js'

export default {
  name: 'UserLayout',
  components: { RouteView },
  mixins: [mixinDevice],
  data() {
    return {}
  },
  mounted() {
    document.body.classList.add('userLayout')
  },
  beforeDestroy() {
    document.body.classList.remove('userLayout')
  }
}
</script>
<style lang="less" scoped>
#userLayout.user-layout-wrapper {
  height: 100%;

  &.mobile {
    .container {
      .main {
        background: white;
        max-width: 368px;
        width: 98%;
      }
    }
  }

  .container {
    width: 100%;
    min-height: 100%;
    background: #90b6f1 url("~@/assets/bg.png") no-repeat 100%;
    background-size: cover;
    padding: 110px 0 144px;
    position: relative;

    a {
      text-decoration: none;
    }

    .top {
      text-align: center;

      .header {
        height: 44px;
        line-height: 44px;

        .badge {
          position: absolute;
          display: inline-block;
          line-height: 1;
          vertical-align: middle;
          margin-left: -12px;
          margin-top: -10px;
          opacity: 0.8;
        }

        .logo {
          height: 64px;
          vertical-align: top;
          margin-right: 16px;
          border-style: none;

        }

        .title {
          font-size: 33px;
          //color: rgba(0, 0, 0, .85);
          color: black;
          font-family: "Chinese Quote", -apple-system, BlinkMacSystemFont, "Segoe UI", "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
          font-weight: 600;
          position: relative;
          top: 2px;
        }
      }

      .desc {
        font-size: 14px;
        // color: rgba(0, 0, 0, 0.45);
        margin-top: 12px;
        margin-bottom: 40px;
      }
    }


    .main {
      background: white url("~@/assets/bg2.png") no-repeat;
      background-size: contain;
      border-radius: 15px;
      width: 60%;
      margin: 0 auto;
      margin-top: 40px;
      height: 600px;
    }


    .footer {
      position: absolute;
      width: 100%;
      bottom: 0;
      padding: 0 16px;
      margin: 48px 0 24px;
      text-align: center;

      .links {
        margin-bottom: 8px;
        font-size: 14px;

        a {
          color: rgba(0, 0, 0, 0.45);
          transition: all 0.3s;

          &:not(:last-child) {
            margin-right: 40px;
          }
        }
      }

      .copyright {
        font-size: 14px;
        color: white;
      }
    }
  }
}
</style>
