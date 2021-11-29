/*
 * Angular Factory which has methods to fetch data 
 * from REST Api's
 */

travelApp
		.factory(
				'baseFactory',
				[
						'$http',
						'$resource',
						function($http, $resource) {

							var baseUrl = "https://api.foursquare.com/v2/venues/explore/?near=";
							// var key =
							// "AIzaSyDWIQDRLj908AucZ1ijuJT7oUEPpK9zGxk";
							var clientId = "--foursquare api client id---";
							var clientSecret = "--foursquare api client secret---";
							var isLoggedIn = false;
							var baseFactory = {};
							baseFactory.getNearByLocations = function(location,
									place) {

								return $http.get(baseUrl + place
										+ "&venuePhotos=1&section="
										+ "touristplaces" + "&client_id="
										+ clientId + "&client_secret="
										+ clientSecret + " &v=20131124");
							};

							baseFactory.Session = function(username) {
								return {
									IsLoggedIn : true,
									userName : username
								};

							}

							return baseFactory;
							
						} ]);