console.log("helll0");

(function($) {
 
    var REGEX_SELECTOR = "emailvalidate",
    foundationReg = $(window).adaptTo("foundation-registry");
 
    foundationReg.register("foundation.validation.validator", {
        selector: "[data-validation='" + REGEX_SELECTOR + "']",
        validate: function(el) {
            var regex_pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            var error_message = "The format must be 'xxx@gmail.com'.";
            var result = el.value.match(regex_pattern);
 
            if (result === null) {
                return error_message;
            }
        }
    });
 
}(jQuery));