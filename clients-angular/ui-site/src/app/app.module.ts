import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {HttpModule} from "@angular/http";

import {AppComponent} from './app.component';

import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';

import {RouterModule, Routes} from "@angular/router";
import {LoginClientComponent} from './login-client/login-client.component';
import {DashboardClientComponent} from './dashboard-client/dashboard-client.component';
import {CommandeComponent} from './commande/component/commande.component';
import {CatalogueComponent} from './catalogue/component/catalogue.component';
import {CatalogueClientComponent} from './catalogue/component/catalogue-client/catalogue-client.component';
import {CatalogueService} from "./catalogue/service/catalogue.service";


const appRoutes: Routes = [
  {
    pathMatch: 'full',
    path: '',
    component: LoginClientComponent
  },
  {
    path: 'dashboardclient',
    component: DashboardClientComponent
  }
]



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginClientComponent,
    DashboardClientComponent,
    CommandeComponent,
    CatalogueComponent,
    CatalogueClientComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpModule
  ],
  providers: [
    CatalogueService],
  bootstrap: [AppComponent]
})
export class AppModule { }
