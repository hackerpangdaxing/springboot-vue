<template>
  <div class="title">

    <div class="container_table">
      <el-table
        :data="tableData"
        stripe
        style="width: 100%"
        :default-sort = "{prop: 'date', order: 'descending'}"
      >
        <el-table-column
          type="selection"
          width="100">
        </el-table-column>
        <el-table-column
          prop="tagid"
          label="tagid"
          sortable
          width="500">
        </el-table-column>
        <el-table-column
          prop="tagCode"
          label="tagCode"
          width="500">
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <!--<el-button type="warning" icon="el-icon-star-off" circle></el-button>-->
            <el-button type="primary" icon="el-icon-star-on" v-if="istag" @click='switchChange'></el-button>
            <el-button type="primary" icon="el-icon-star-off" v-else="!istag" @click='switchChange'></el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination class="fy"
                     layout="prev, pager, next"
                     @current-change="current_change"
                     :total="total"
                     background
      >
      </el-pagination>
    </div>
  </div>
</template>

<script>
  export default {
    name:'HelloWorld',
    data() {
      return {
        currentPage:1,
        pagesize:10, //每页的数据条数
        istag: true,
        input:"",
        input21: '',
        tableData:[]
      };
    } ,
    methods: {
      getApiData:function() {
        //设置请求路径
        var url = "http://127.0.0.1:6600/tagname/page?pageNum=" + this.currentPage + "&pageSize=" + this.pagesize;
        // 发送请求:将数据返回到一个回到函数中
        // 并且响应成功以后会执行then方法中的回调函数
        this.$http.get(url).then((result) => {
          debugger
          this.tableData = result.data.list;
          this.total = result.data.total;
        });
      },

      tableRowClassName({row, rowIndex}) {
        if (rowIndex === 0) {
          return 'th';
        }
        return '';
      },
      switchChange(){
        this.istag = !this.istag ;
      },

      current_change:function(currentPage){
        this.currentPage = currentPage;
        this.getApiData();
      }
    },
    created:function(){
      this.getApiData();
    },
  };
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
  .fl{
    float: right;
    margin-right:20px;
  }
  .fy{
    text-align:center;
    margin-top:30px;
  }
  .title{
    height:100%;
  }
</style>
