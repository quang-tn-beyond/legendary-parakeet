// src/pages/AdminPage.jsx
import React, { useState } from "react";
import Sidebar from "./sidebar";
import Dashboard from "./dashboard";

const Admin = () => {
  const [selected, setSelected] = useState("dashboard");

  const renderContent = () => {
    switch (selected) {
      case "dashboard":
        return <Dashboard />;
      case "users":
        return <div style={{ padding: "20px" }}>Users Management</div>;
      case "orders":
        return <div style={{ padding: "20px" }}>Orders Management</div>;
      case "revenue":
        return <div style={{ padding: "20px" }}>Revenue Details</div>;
      default:
        return <Dashboard />;
    }
  };

  return (
    <div style={{ display: "flex" }}>
      <Sidebar onSelect={setSelected} selectedItem={selected} />
      <div style={{ flex: 1 }}>{renderContent()}</div>
    </div>
  );
};

export default Admin;
