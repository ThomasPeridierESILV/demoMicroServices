import {Component, OnInit} from '@angular/core';
import {CommandeService} from "../service/commande.service";
import {Commande} from "../model/commande.model";

@Component({
    selector: 'app-commande',
    templateUrl: './commande.component.html',
    styleUrls: ['./commande.component.css']
})
export class CommandeComponent implements OnInit {

    public commandes: Commande[];

    constructor(public commandeService: CommandeService) {
    }

    ngOnInit(): void {
        this.commandeService.getAll().subscribe((commandes) => {
            console.log(commandes);
            this.commandes = commandes
        }, (error) => {
            console.log(error);
        })
    }

}