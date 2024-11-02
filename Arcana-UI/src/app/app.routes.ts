import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SpellbookComponent } from './spellbook/spellbook.component'; // Import the component

export const routes: Routes = [
    { path: '/spellbook', component: SpellbookComponent },
    { path: '', redirectTo: '/spellbook', pathMatch: 'full' } // Optional default route
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
