import {Injectable} from '@angular/core';
import {Http} from "@angular/http";
import {EndPoints} from "../../endpoints";
import {Response} from "@angular/http";
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'
import 'rxjs/add/observable/throw'
import {Commande} from "../model/commande.model";

@Injectable()
export class CommandeService {

    constructor(private _http: Http) {
    }

    getAll() {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_COMMANDE)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    get(id: number) {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_COMMANDE + id)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    add(commande: Commande) {
        return this._http.post(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_COMMANDE, JSON.stringify(commande))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    update(commande: Commande, id:number) {
        return this._http.put(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_COMMANDE+id, JSON.stringify(commande))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }


    errorHandler(error: Response) {
        return Observable.throw(error || "SERVER ERROR");
    }
}