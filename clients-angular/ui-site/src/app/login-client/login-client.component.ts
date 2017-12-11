import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
    selector: 'app-login-client',
    templateUrl: './login-client.component.html',
    styleUrls: ['./login-client.component.css']
})
export class LoginClientComponent implements OnInit {

    constructor(private router: Router) {
    }

    ngOnInit() {
    }

    loginClient(e) {
        e.preventDefault();
        console.log(e);
        var username = e.target.elements[0].value;
        var password = e.target.elements[1].value;

        console.log(username, password);
        if (username == 'admin' && password == 'admin') {
            this.router.navigate(['dashboardclient']);
        }
    }

}
