module.exports = function(grunt) {

  require('matchdep').filterDev('grunt-*').forEach(grunt.loadNpmTasks);

  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),

    clean: ["resources/public"],
    copy: {
      main: {
        files: [{
          expand: true,
          flatten: true,
          src: [
            'resources/libs/Leaflet/dist/images/*',
            'resources/libs/leaflet-locatecontrol/src/images/*'
          ],
          dest: 'resources/public/images/'
        }, {
          expand: true,
          flatten: true,
          src: ['resources/json/*'],
          dest: 'resources/public/'
        }, {
          src: 'resources/precompiled.html',
          dest: 'resources/public/index.html'
        }]
      }
    },

    useminPrepare: {
      options: {
        dest: 'resources/public'
      },
      html: ['resources/public/index.html', 'index.html']
    },

    usemin: {
      html: ['resources/public/index.html', 'index.html']
    }
  });

  grunt.registerTask('build', [
    'clean',
    'copy',
    'useminPrepare',
    'concat',
    'uglify',
    'cssmin',
    'usemin']);
};
