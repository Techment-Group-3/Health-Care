const url = 'http://localhost:3000/hospitals'

    addhosbtn.onclick = function (e) {
      //debugger ;
      e.preventDefault();
      addUser();
    };

    function addUser() {

        let id = hid.value;
        let name = hname.value;
        let address = haddress.value;
        let street = hstreet.value;
        let pincode = hpincode.value;
        let state = hstate.value;
  
        axios.post(url, {
          id,
          name,
          address,
          street,
          pincode,
          state
        })
          .then(function () { alert("Record Inserted!") }).catch(function (er) { alert("Error!"); console.error(er) });
      }