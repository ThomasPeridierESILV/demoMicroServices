import {Injectable} from '@angular/core';
import {Http} from "@angular/http";
import {EndPoints} from "../../endpoints";
import {Response} from "@angular/http";
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'
import 'rxjs/add/observable/throw'
import {Client} from '../model/client.model'

@Injectable()
export class ClientService {

    constructor(private _http: Http) {
    }

    getAll() {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CLIENT)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    get(id: number) {
        return this._http.get(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CLIENT + id)
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    add(stock: Client) {
        return this._http.post(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CLIENT, JSON.stringify(stock))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }

    update(stock: Client, id: number) {
        return this._http.put(EndPoints.API_ROOT + EndPoints.API_ENDPOINT_CLIENT + id, JSON.stringify(stock))
            .map((response: Response) => response.json()).catch(this.errorHandler);
    }


    errorHandler(error: Response) {
        return Observable.throw(error || "SERVER ERROR");
    }
}
