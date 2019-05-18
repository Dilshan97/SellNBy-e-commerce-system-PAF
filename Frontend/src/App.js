import React from 'react';
import { BrowserRouter as Router, Switch, Route, Link} from 'react-router-dom';
import './App.css';

import Navbar from './components/navbar';
import Main from './components/content';
import Add_item from './components/add_item';
import Edit_item from './components/edit_item';

function App() {
  return (
      <Router>
          <div className="mdl-layout mdl-js-layout">
              <Navbar/>
              
              <Route exact path="/" component={Main}/>
              <Route exact path="/add-item" component={Add_item}/>
              <Route path='/edit/:item_id' component={Edit_item}/> 
              
          </div>
         
      </Router>
    
  );
}

export default App;
