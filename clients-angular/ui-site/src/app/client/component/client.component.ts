import { Component, OnInit } from '@angular/core';
import {ClientService} from "../service/client.service";
import {Client} from "../model/client.model";

@Component({
    selector: 'app-client',
    templateUrl: './client.component.html',
    styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

    public clients: Client[];

    constructor(public clientService: ClientService) {
    }

    ngOnInit(): void {
        this.clientService.getAll().subscribe((clients)=>{
            console.log(clients);
            this.clients=clients
        },(error) => {
            console.log(error);
        })
    }

}