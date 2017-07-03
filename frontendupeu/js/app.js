'use strict';
var app = angular.module('app', [
    'ngResource',
    'ngRoute'
]);

var SERVER = 'http://localhost:8083';
var SERVER2 = 'http://localhost:8084';
var ACTIVE = '1';
var INACTIVE = '0';
app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
        $routeProvider
                .when('/producto', {
                    templateUrl: 'views/producto/mainProducto.html',
                    controller: 'campaignController'
                })

                .when('/producto/new', {
                    templateUrl: 'views/producto/formProducto.html',
                    controller: 'campaignController'
                })
                .when('/producto/edit/:id', {
                    templateUrl: 'views/campaign/campaign_edit.html',
                    controller: 'campaignController',
                    method: 'findCampaign'
                })
                .when('/categoria', {
                    templateUrl: 'views/categoria/mainCategoria.html',
                    controller: 'dientesController'
                })
                .when('/categoria/new', {
                    templateUrl: 'views/categoria/formCategorira.html',
                    controller: 'campaignController'
                })

                .when('/categoria/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })
                .when('/compra', {
                    templateUrl: 'views/compra/mainCompra.html',
                    controller: 'dientesController'
                })
                .when('/compra/new', {
                    templateUrl: 'views/compra/formCompra.html',
                    controller: 'campaignController'
                })

                .when('/compra/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })
                .when('/proveedor', {
                    templateUrl: 'views/proveedor/mainProveedor.html',
                    controller: 'personaController'
                })
                .when('/proveedor/new', {
                    templateUrl: 'views/proveedor/formProveedor.html',
                    controller: 'campaignController'
                })

                .when('/proveedor/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })
                .when('/venta', {
                    templateUrl: 'views/venta/mainVenta.html',
                    controller: 'doctorsController'
                })
                .when('/venta/new', {
                    templateUrl: 'views/venta/formVenta.html',
                    controller: 'dientesController'
                })
                .when('/venta/generar', {
                    templateUrl: 'views/venta/generarVenta.html',
                    controller: 'dientesController',
                    
                })
                .when('/cliente', {
                    templateUrl: 'views/cliente/maincliente.html',
                    controller: 'diagnosticosController'
                })
                .when('/cliente/new', {
                    templateUrl: 'views/cliente/formCliente.html',
                    controller: 'dientesController'
                })
                .when('/cliente/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })
                .when('/veriProducto', {
                    templateUrl: 'views/verificarPro/mainVerificarPro.html',
                    controller: 'diagnosticosController'
                })
                .when('/veriProducto/new', {
                    templateUrl: 'views/veriProducto/formVerificarPro.html',
                    controller: 'dientesController'
                })
                .when('/veriProducto/edit/:id', {
                    templateUrl: 'views/diente/editFormDientes.html',
                    controller: 'dientesController',
                    method: 'findDiente'
                })
                .when('/ventasDetalladas', {
                    templateUrl: 'views/ventasDetalladas/mainVentaDetalladas.html',
                    controller: 'diagnosticosController'
                })
               
                .when('/comprasDetalladas', {
                    templateUrl: 'views/comprasDetalladas/mainComprasDetalladas.html',
                    controller: 'diagnosticosController'
                })
                .when('/empleado', {
                    templateUrl: 'views/empleado/mainEmpleado.html',
                    controller: 'campaignController'
                })

                .when('/empleado/new', {
                    templateUrl: 'views/empleado/formEmpleado.html',
                    controller: 'campaignController'
                })

                .otherwise({redirectTo: '/'});






    }]);
