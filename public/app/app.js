'use strict';

// Declare app level module which depends on views, and components
angular.module('cclgApp', [
  'ngRoute'])
.controller('cclgAppCtrl', [
	'$scope', function($scope) {
	$scope.sociList = [];

    $scope.quotes = [
    	{id: 10, name:'Familia', value:120},
    	{id: 20, name:'Adult o familia jubilada', value:100},
    	{id: 30, name:'Jove o Jubilat', value:80},
    	{id: 40, name:'Estudiant', value:40},
    	{id: 50, name:'Protector', value:250},
    	{id: 60, name:'benefactor', value:500}
    ];

    

    function Soci(){
    	this.quota = $scope.quotes[0];
    	this.actiu = true;
    }

    $scope.soci = new Soci();

    $scope.addSoci = function() {
      if ($scope.soci.name) {
        var soci = angular.copy($scope.soci);
        $scope.sociList.push(soci);
        $scope.soci = new Soci();
      }
    };

  }]);
