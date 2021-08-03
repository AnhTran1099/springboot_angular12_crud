import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrandListComponent } from './brand/brand-list/brand-list.component';

const routes: Routes = [
  { path:'', redirectTo: 'brand', pathMatch:'full'},
  { path: 'brand', component: BrandListComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
