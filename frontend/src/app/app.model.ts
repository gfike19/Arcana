import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';  // Import HttpClientModule here

import { AppComponent } from './app.component';
import { SpellbookComponent } from './spellbook/spellbook.component';  //component import

@NgModule({
  declarations: [

  ],
  imports: [
    AppComponent,
    BrowserModule,
    HttpClientModule,  // Add HttpClientModule here
    SpellbookComponent
  ],
  providers: []
})
export class AppModule { }
