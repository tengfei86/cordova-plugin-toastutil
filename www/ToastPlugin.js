function ToastPlugin() {}

ToastPlugin.prototype.showToast = function(succssCallback,errorCallback) {
    return cordova.exec(successCallback,errorCallback,'ToastPlugin','showToast',[]);
};

var toastplugin = new ToastPlugin();
module.exports = toastplugin;
