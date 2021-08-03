import { Component, OnInit } from '@angular/core';
import { BrandService } from 'src/app/brand.service';
import { Brand } from '../model/brand';

@Component({
  selector: 'app-brand-list',
  templateUrl: './brand-list.component.html',
  styleUrls: ['./brand-list.component.css']
})
export class BrandListComponent implements OnInit {

  brands: Brand[] | undefined;

  constructor(private brandService: BrandService) { }

  ngOnInit(): void {
    this.brandService.findAll().subscribe(data => {
      this.brands = data;
    });
  }

}
