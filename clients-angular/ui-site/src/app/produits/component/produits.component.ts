import {Component, OnInit} from '@angular/core';
import "rxjs/add/operator/map";
import {ProduitService} from "../service/produits.service";
import {Produit} from "../model/produit.model";

@Component({
    selector: 'app-produits',
    templateUrl: './produits.component.html',
    styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {

    public produits: Produit[];

    constructor(public produitService: ProduitService) {
    }

    ngOnInit(): void {
        this.produitService.getAll().subscribe((produits)=>{
            console.log(produits);
            this.produits=produits
        },(error) => {
            console.log(error);
        })
    }


}
