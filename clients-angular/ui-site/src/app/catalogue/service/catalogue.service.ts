import {Injectable} from '@angular/core';
import {Http} from "@angular/http";
import {EndPoints} from "../../endpoints";
import {Response} from "@angular/http";
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'
import 'rxjs/add/observable/throw'
import {Catalogue} from "../model/catalogue.model";

@Injectable()
export class CatalogueService {

    constructor(private _http: Http) {
    }

    getAll() {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CATALOGUE)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    get(id: number) {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CATALOGUE + id)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    add(catalogue: Catalogue) {
        return this._http.post(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CATALOGUE, JSON.stringify(catalogue))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    update(catalogue: Catalogue, id: number) {
        return this._http.put(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CATALOGUE + id, JSON.stringify(catalogue))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }


    errorHandler(error: Response) {
        return Observable.throw(error || "SERVER ERROR");
    }
}