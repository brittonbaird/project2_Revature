/*
 * Controller to share details 
 */
travelApp.controller("popupController", [
	'$scope',
	'$uibModalInstance',
	'$http',
	'baseFactory',
	'baseService',
	"$cookieStore",
	"$location",
	"$route",
	function($scope, $uibModalInstance, $http, baseFactory, baseService,
		$cookieStore, $location, $route) {

		$scope.cancel = function() {

			$uibModalInstance.dismiss('cancel');
		};
		$scope.shareEmail = function() {

			var data = {
				"countryName" : document.getElementById("country_name").value,
				"cityName" : document.getElementById("city_name").value,
				"travelDate" : document.getElementById("travel_date").value,
				"travelReturn" : document.getElementById("travel_return").value,
				"numPeople" : document.getElementById("num_people").value,
				"userId": $cookieStore.get('userId'),
			};
			var request = {
				method: 'POST',
				url: '/savePlan',
				headers: {
					'Content-Type': 'application/json'
				},
				data: data
			}
			$http(request).then(function(response) {

				$scope.myPlaces = response.data;

			}, function(response) {
				// $scope.hotelFlag = true;
			});

			baseFactory.shareEmail(data).then(function(result, status) {
				alert("Plan created successfully");
				$uibModalInstance.dismiss('cancel');
				$route.reload();
			}).then(function(error) {
				alert("Error");
			})
			alert("Plan created successfully");
			$route.reload();
			$uibModalInstance.dismiss('cancel');
		};
	}]);