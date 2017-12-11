import { Component, OnInit } from '@angular/core';
import {CatalogueService} from "../service/catalogue.service";
import {Catalogue} from "../model/catalogue.model";

@Component({
    selector: 'app-catalogue',
    templateUrl: './catalogue.component.html',
    styleUrls: ['./catalogue.component.css']
})
export class CatalogueComponent implements OnInit {

    public catalogues: Catalogue[];

    constructor(public catalogueService: CatalogueService) {
    }

    ngOnInit(): void {
        this.catalogueService.getAll().subscribe((catalogues)=>{
            console.log(catalogues);
            this.catalogues=catalogues
        },(error) => {
            console.log(error);
        })
    }

}