<template>
  <div id="app">
    <JobList />
  </div>
</template>

<script>
import JobList from './components/JobList.vue';  // 从 components 文件夹中正确导入 JobList

export default {
  name: 'App',
  components: {
    JobList
  }
};
</script>

<style scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
