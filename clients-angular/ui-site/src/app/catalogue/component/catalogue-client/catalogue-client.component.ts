import {Component, OnInit} from '@angular/core';
import {CatalogueService} from "../../service/catalogue.service";
import {Catalogue} from "../../model/catalogue.model";

@Component({
    selector: 'app-catalogue-client',
    templateUrl: './catalogue-client.component.html',
    styleUrls: ['./catalogue-client.component.css']
})
export class CatalogueClientComponent implements OnInit {

    public catalogues: Catalogue[];

    constructor(public catalogueService: CatalogueService) {
    }

    ngOnInit(): void {
        this.catalogueService.getAll().subscribe((catalogues) => {
            console.log(catalogues);
            this.catalogues = catalogues
        }, (error) => {
            console.log(error);
        })
    }

    commander($event: Event) {


    }
}
