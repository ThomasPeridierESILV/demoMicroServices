import {Injectable} from '@angular/core';
import {Http} from "@angular/http";
import {EndPoints} from "../../endpoints";
import {Response} from "@angular/http";
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'
import 'rxjs/add/observable/throw'
import {Produit} from "../model/produit.model";

@Injectable()
export class ProduitService {

    constructor(private _http: Http) {
    }

    getAll() {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_PRODUIT)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    get(id: number) {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_PRODUIT + id)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    add(produit: Produit) {
        return this._http.post(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_PRODUIT, JSON.stringify(produit))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    update(produit: Produit, id:number) {
        return this._http.put(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_PRODUIT+id, JSON.stringify(produit))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }


    errorHandler(error: Response) {
        return Observable.throw(error || "SERVER ERROR");
    }
}