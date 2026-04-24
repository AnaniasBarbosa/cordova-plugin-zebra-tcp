var exec = require('cordova/exec');

exports.print = function(ip, port, zpl, success, error) {
    exec(success, error, "ZebraTcpPrinter", "print", [ip, port, zpl]);
};