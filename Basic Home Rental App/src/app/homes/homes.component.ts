import {Component, OnInit} from '@angular/core';
import {DataService} from '../data.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-homes',
  templateUrl: './homes.component.html'
})
export class HomesComponent implements OnInit {

  homeTypeDropdownOpen = false;
  currentHomeTypeFilters = [];
  currentSearch = '';
  homes$ = this.dataService.homes$;

  constructor(
    private dataService: DataService,
    private router: Router,
    private route: ActivatedRoute
  ) {
  }

  ngOnInit() {

    this.route.queryParams.subscribe(params => {
      const homeTypeFilters = params['home-type'] || [];
      const searchString = params.search || '';
      this.dataService.loadHomes(homeTypeFilters, searchString);
      this.currentHomeTypeFilters = homeTypeFilters;
      this.currentSearch = searchString;
    });


  }

  homeTypeFilterApplied($event) {

    this.homeTypeDropdownOpen = false;

    const params = this.route.snapshot.queryParams;
    const homeType = {'home-type': $event};

    this.router.navigate(['homes'], {queryParams: {...params, ...homeType}});

  }

  searchApplied($event) {

    const params = this.route.snapshot.queryParams;
    const search = {search: $event};

    this.router.navigate(['homes'], {queryParams: {...params, ...search}});

  }

}
