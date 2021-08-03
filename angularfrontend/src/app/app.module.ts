import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrandListComponent } from './brand/brand-list/brand-list.component';
import { HttpClientModule } from '@angular/common/http';
import {DataTablesModule} from 'angular-datatables';


@NgModule({
  declarations: [
    AppComponent,
    BrandListComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    DataTablesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
