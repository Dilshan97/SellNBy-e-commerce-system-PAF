import React from 'react';
import { BrowserRouter as Router, Route} from 'react-router-dom';
import './App.css';

import Navbar from './components/navbar';
import Main from './components/content';
import Add_item from './components/add_item';
import Edit_item from './components/edit_item';
import Login from './components/login';
import Signup from './components/sign_up';

function App() {
  return (
      <Router>
          <div className="mdl-layout mdl-js-layout">
              <Navbar/>
              
              <Route exact path="/" component={Main}/>
              <Route exact path="/add-item" component={Add_item}/>
              <Route path='/edit/:item_id' component={Edit_item}/> 
              <Route path='/login' component={Login}/>
              <Route path='/signup' component={Signup}/>


          </div>
         
      </Router>
    
  );
}

export default App;
