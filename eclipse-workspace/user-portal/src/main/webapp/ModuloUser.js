angular.module('user-portal', [])
.controller('Usuarios', function($scope, $http) {
	
	$scope.consultarUsuarios = function() {
	    $http.get('http://localhost:8080/user-portal/api').
	        then(function(response) {
	            $scope.usuarios = response.data;
	        });
	};
    
    $scope.crearUsuario = function() {
		var dataObj = {
				firstName : $scope.usuarioNuevo.firstName,
				lastName : $scope.usuarioNuevo.lastName,
				email : $scope.usuarioNuevo.email
		};	
		var res = $http.post('http://localhost:8080/user-portal/api', dataObj);
		res.success(function(data, status, headers, config) {
			$scope.message = data;
			$scope.consultarUsuarios();
		});
      };
      
      $scope.reset = function(){
    	  alert('reset');
    	  $scope.usuarioNuevo.firstName='';
    	  $scope.usuarioNuevo.lastName='';
    	  $scope.usuarioNuevo.email=''; 	  
      };
      
      $scope.consultarUsuarios();
});