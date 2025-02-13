// src/components/Sidebar.jsx
import React from "react";

const Sidebar = ({ onSelect, selectedItem }) => {
  const menuItems = [
    { key: "dashboard", label: "Dashboard" },
    { key: "users", label: "Users" },
    { key: "orders", label: "Orders" },
    { key: "revenue", label: "Revenue" },
  ];

  return (
    <div
      style={{
        width: "250px",
        backgroundColor: "var(--primary-color)", // Uses the primary color variable
        minHeight: "100vh",
        padding: "20px",
        color: "#fff",
      }}
    >
      <h4 style={{ color: "#fff" }}>Admin Menu</h4>
      <ul style={{ listStyle: "none", padding: 0 }}>
        {menuItems.map((item) => (
          <li
            key={item.key}
            style={{
              padding: "10px",
              cursor: "pointer",
              backgroundColor: selectedItem === item.key ? "#555" : "inherit",
              borderRadius: "4px",
              marginBottom: "5px",
              color: "#fff",
            }}
            onClick={() => onSelect(item.key)}
          >
            {item.label}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Sidebar;
