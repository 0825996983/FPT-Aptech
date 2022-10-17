var elForm,elSelectPackage, elPackageHint, elTerms, elTermsHint;
el form               = document.getElementById('formSignup');
elSelectPackage       = document.getElementById('package');
elPackageHint         = document.getElementById('packageHint');
elTerms               = document.getElementById('terms');
elTermsHint           = document.getElementById('termsHint');

function packageHint(){
    var pack = this.options[this.selecteedIndex].value;
    if(pack == 'monthly'){
        rlPackageHint.innerHTML = 'Save $10 if you pay for 1 year !';
    }else {
        elPackageHint.innerHTML = 'wise choice!';
    }
}
function checkTerms(event) {
    if (!elTerms.checked) {
        elTermsHint.innerHTML = 'You must agree to the terms';
    }
}
elform.addEventListener('submit',checkTerms, false);
elSelectPackage.addEventListener('change', packageHint, false);