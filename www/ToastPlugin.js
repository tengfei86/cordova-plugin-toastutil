function ToastPlugin() {}

ToastPlugin.prototype.showToast = function() {
    return cordova.exec(function(){},function(){},'ToastPlugin','showToast',[]);
};

var toastplugin = new ToastPlugin();
module.exports = toastplugin;
