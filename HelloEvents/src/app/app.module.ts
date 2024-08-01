import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InscriptionComponent } from './Components/inscription/inscription.component';
import { GestioncontactComponent } from './Components/gestioncontact/gestioncontact.component';

@NgModule({
  declarations: [
    AppComponent,
    InscriptionComponent,
    GestioncontactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
