import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestioncontactComponent } from './Components/gestioncontact/gestioncontact.component';

const routes: Routes = [
  {path:"contact",component:GestioncontactComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
