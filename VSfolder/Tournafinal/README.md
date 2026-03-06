CHATS:
<!DOCTYPE html>
<html lang="en" data-theme="dark">
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>TournaMeet – Messages</title>
<link href="https://fonts.googleapis.com/css2?family=Barlow:wght@400;500;600;700;900&family=Barlow+Condensed:wght@700;900&display=swap" rel="stylesheet"/>
<style>
/* ── THEME TOKENS ── */
[data-theme="dark"] {
  --bg:         #0F0F12;
  --bg2:        #17171D;
  --bg3:        #1F1F28;
  --bg4:        #2A2A36;
  --mid:        #3A3A4A;
  --border:     #2E2E3E;
  --text:       #F0EFF5;
  --text-dim:   #9898AC;
  --text-faint: #55556A;
  --shadow:     0 8px 32px #00000055;
}
[data-theme="light"] {
  --bg:         #F4F3F8;
  --bg2:        #FFFFFF;
  --bg3:        #EDEAF5;
  --bg4:        #E4E0F0;
  --mid:        #C5C2D5;
  --border:     #DDD9EE;
  --text:       #1A1828;
  --text-dim:   #56547A;
  --text-faint: #9896B8;
  --shadow:     0 8px 32px #0000001A;
}
:root {
  --orange:      #FF6A00;
  --orange-glow: #FF6A0033;
  --radius:      12px;
  --radius-sm:   8px;
}

*, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }
html, body { height: 100%; }

body {
  font-family: 'Barlow', sans-serif;
  background: var(--bg);
  color: var(--text);
  display: flex; flex-direction: column;
  overflow: hidden;
  transition: background .3s, color .3s;
}

/* ── TOPBAR ── */
.topbar {
  z-index: 100; display: flex; align-items: center;
  height: 60px; padding: 0 24px; gap: 8px;
  background: var(--bg2); border-bottom: 1px solid var(--border);
  box-shadow: var(--shadow); flex-shrink: 0;
  transition: background .3s, border-color .3s;
}
.logo {
  font-family: 'Barlow Condensed', sans-serif;
  font-weight: 900; font-size: 22px; letter-spacing: 1px;
  color: var(--text); margin-right: auto; white-space: nowrap;
  transition: color .3s;
}
.logo span { color: var(--orange); }

.nav-link {
  font-size: 13px; font-weight: 600; color: var(--text-dim);
  text-decoration: none; padding: 6px 12px; border-radius: var(--radius-sm);
  transition: all .2s; white-space: nowrap;
}
.nav-link:hover { color: var(--orange); background: var(--orange-glow); }
.nav-link.active { color: var(--orange); background: var(--orange-glow); }

.topbar-actions { display: flex; align-items: center; gap: 10px; }

.theme-btn {
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius-sm); width: 38px; height: 38px;
  display: flex; align-items: center; justify-content: center;
  cursor: pointer; font-size: 17px; transition: all .2s;
  flex-shrink: 0;
}
.theme-btn:hover { border-color: var(--orange); transform: rotate(20deg); }

.notif-link {
  position: relative; cursor: pointer;
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius-sm); padding: 8px 10px;
  color: var(--text-dim); font-size: 17px; transition: all .2s;
  text-decoration: none; display: flex; align-items: center;
}
.notif-link:hover { border-color: var(--orange); color: var(--orange); }
.notif-badge {
  position: absolute; top: -4px; right: -4px;
  background: var(--orange); color: #fff;
  font-size: 10px; font-weight: 700;
  width: 18px; height: 18px; border-radius: 50%;
  display: flex; align-items: center; justify-content: center;
  border: 2px solid var(--bg2);
}

.avatar {
  width: 36px; height: 36px; border-radius: 50%;
  background: linear-gradient(135deg, var(--orange), #FF3D00);
  display: flex; align-items: center; justify-content: center;
  font-weight: 700; font-size: 13px; color: #fff; cursor: pointer;
  border: 2px solid var(--border); transition: border-color .2s;
  flex-shrink: 0;
}
.avatar:hover { border-color: var(--orange); }

/* ── LAYOUT ── */
.app { display: flex; flex: 1; overflow: hidden; }

/* ── SIDEBAR ── */
.sidebar {
  width: 280px; min-width: 280px;
  background: var(--bg2); border-right: 1px solid var(--border);
  display: flex; flex-direction: column;
  transition: background .3s, border-color .3s;
}
.sidebar-header { padding: 20px 16px 12px; border-bottom: 1px solid var(--border); }
.sidebar-title  {
  font-family: 'Barlow Condensed', sans-serif;
  font-weight: 700; font-size: 18px; margin-bottom: 12px; letter-spacing: .5px;
}

.search-box { position: relative; }
.search-box input {
  width: 100%; background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius-sm); padding: 9px 12px 9px 36px;
  color: var(--text); font-family: 'Barlow', sans-serif; font-size: 13px;
  outline: none; transition: border-color .2s, background .3s;
}
.search-box input::placeholder { color: var(--text-faint); }
.search-box input:focus { border-color: var(--orange); }
.search-icon {
  position: absolute; left: 10px; top: 50%; transform: translateY(-50%);
  color: var(--text-faint); font-size: 14px; pointer-events: none;
}

.tab-bar  { display: flex; gap: 4px; padding: 10px 12px; }
.tab {
  flex: 1; padding: 6px; border-radius: 6px; text-align: center;
  font-size: 12px; font-weight: 600; cursor: pointer; color: var(--text-dim);
  transition: all .2s; border: none; background: none; font-family: 'Barlow', sans-serif;
}
.tab:hover  { color: var(--orange); }
.tab.active { background: var(--orange-glow); color: var(--orange); }

.contacts { flex: 1; overflow-y: auto; padding: 12px; }
.contacts::-webkit-scrollbar { width: 4px; }
.contacts::-webkit-scrollbar-thumb { background: var(--border); border-radius: 2px; }

/* ── EMPTY SIDEBAR ── */
.empty-contacts {
  display: flex; flex-direction: column; align-items: center;
  justify-content: center; height: 100%; gap: 14px;
  padding: 32px 20px; text-align: center;
}
.ec-icon { font-size: 52px; opacity: .2; }
.empty-contacts h3 { font-size: 14px; font-weight: 700; color: var(--text-dim); }
.empty-contacts p  {
  font-size: 12px; color: var(--text-faint); line-height: 1.6;
}
.ec-divider { width: 32px; height: 2px; background: var(--border); border-radius: 2px; }

/* ── CHAT AREA EMPTY STATE ── */
.chat-area {
  flex: 1; display: flex; flex-direction: column;
  background: var(--bg); min-width: 0; transition: background .3s;
}
.empty-chat {
  flex: 1; display: flex; flex-direction: column;
  align-items: center; justify-content: center;
  gap: 18px; text-align: center; padding: 40px;
}
.empty-chat .big-icon {
  font-size: 80px; opacity: .12;
  animation: float 4s ease-in-out infinite;
}
@keyframes float {
  0%,100% { transform: translateY(0);    }
  50%      { transform: translateY(-12px); }
}
.empty-chat h2 {
  font-family: 'Barlow Condensed', sans-serif;
  font-size: 28px; font-weight: 900; letter-spacing: .5px; color: var(--text);
}
.empty-chat p  { font-size: 14px; color: var(--text-faint); max-width: 320px; line-height: 1.7; }

.feature-pills { display: flex; gap: 10px; flex-wrap: wrap; justify-content: center; margin-top: 8px; }
.pill {
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: 20px; padding: 7px 16px;
  font-size: 12px; font-weight: 600; color: var(--text-dim);
  display: flex; align-items: center; gap: 6px;
  transition: all .2s;
}
.pill:hover { border-color: var(--orange); color: var(--orange); }

.status-strip {
  margin-top: 12px; display: flex; align-items: center; gap: 8px;
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius); padding: 12px 20px;
  font-size: 13px; color: var(--text-dim);
}
.status-dot-live {
  width: 9px; height: 9px; border-radius: 50%; background: var(--orange);
  animation: pulse-live 1.8s infinite; flex-shrink: 0;
}
@keyframes pulse-live {
  0%,100% { box-shadow: 0 0 0 0 var(--orange-glow); }
  50%      { box-shadow: 0 0 0 6px transparent; }
}
</style>
</head>
<body>

<!-- TOPBAR -->
<div class="topbar">
  <div class="logo">TOURNA<span>MEET</span></div>
  <a href="tournameet-chat.html" class="nav-link active">💬 Messages</a>
  <a href="tournameet-notifications.html" class="nav-link">🔔 Notifications</a>
  <div class="topbar-actions">
    <div class="theme-btn" id="themeToggle" title="Toggle theme">☀️</div>
    <a href="tournameet-notifications.html" class="notif-link" title="Notifications">
      🔔<span class="notif-badge">0</span>
    </a>
    <div class="avatar">JD</div>
  </div>
</div>

<!-- APP -->
<div class="app">

  <!-- SIDEBAR -->
  <div class="sidebar">
    <div class="sidebar-header">
      <div class="sidebar-title">💬 Messages</div>
      <div class="search-box">
        <span class="search-icon">🔍</span>
        <input type="text" placeholder="Search players…" id="searchInput"/>
      </div>
    </div>
    <div class="tab-bar">
      <button class="tab active">All</button>
      <button class="tab">Teams</button>
      <button class="tab">Rivals</button>
    </div>
    <div class="contacts" id="contactList">
      <div class="empty-contacts">
        <div class="ec-icon">👥</div>
        <div class="ec-divider"></div>
        <h3>No players yet</h3>
        <p>Once users register and join tournaments, their conversations will appear here.</p>
      </div>
    </div>
  </div>

  <!-- CHAT AREA -->
  <div class="chat-area">
    <div class="empty-chat">
      <div class="big-icon">⚔️</div>
      <h2>No Conversations Yet</h2>
      <p>When players join TournaMeet, you'll be able to message opponents, teammates, and rivals right here.</p>
      <div class="feature-pills">
        <div class="pill">💬 Direct Messages</div>
        <div class="pill">👥 Group Chats</div>
        <div class="pill">📎 File Sharing</div>
        <div class="pill">🔔 Notifications</div>
      </div>
      <div class="status-strip">
        <div class="status-dot-live"></div>
        Waiting for players to register…
      </div>
    </div>
  </div>

</div>

<script>
// ── THEME ─────────────────────────────────────────────────────────────────────
const html       = document.documentElement;
const themeBtn   = document.getElementById('themeToggle');

function applyTheme(t) {
  html.setAttribute('data-theme', t);
  themeBtn.textContent = t === 'dark' ? '☀️' : '🌙';
  localStorage.setItem('tm-theme', t);
}

applyTheme(localStorage.getItem('tm-theme') || 'dark');

themeBtn.onclick = () =>
  applyTheme(html.getAttribute('data-theme') === 'dark' ? 'light' : 'dark');

// ── TABS ──────────────────────────────────────────────────────────────────────
document.querySelectorAll('.tab').forEach(t => {
  t.onclick = () => {
    document.querySelectorAll('.tab').forEach(x => x.classList.remove('active'));
    t.classList.add('active');
  };
});
</script>
</body>
</html>



NOTIFS:
<!DOCTYPE html>
<html lang="en" data-theme="dark">
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>TournaMeet – Notifications</title>
<link href="https://fonts.googleapis.com/css2?family=Barlow:wght@400;500;600;700;900&family=Barlow+Condensed:wght@700;900&display=swap" rel="stylesheet"/>
<style>
/* ── THEME TOKENS ── */
[data-theme="dark"] {
  --bg:         #0F0F12;
  --bg2:        #17171D;
  --bg3:        #1F1F28;
  --bg4:        #2A2A36;
  --mid:        #3A3A4A;
  --border:     #2E2E3E;
  --text:       #F0EFF5;
  --text-dim:   #9898AC;
  --text-faint: #55556A;
  --shadow:     0 8px 32px #00000055;
}
[data-theme="light"] {
  --bg:         #F4F3F8;
  --bg2:        #FFFFFF;
  --bg3:        #EDEAF5;
  --bg4:        #E4E0F0;
  --mid:        #C5C2D5;
  --border:     #DDD9EE;
  --text:       #1A1828;
  --text-dim:   #56547A;
  --text-faint: #9896B8;
  --shadow:     0 8px 32px #0000001A;
}
:root {
  --orange:      #FF6A00;
  --orange-glow: #FF6A0033;
  --radius:      12px;
  --radius-sm:   8px;
}

*, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }
html, body { height: 100%; }

body {
  font-family: 'Barlow', sans-serif;
  background: var(--bg);
  color: var(--text);
  display: flex; flex-direction: column;
  min-height: 100vh;
  transition: background .3s, color .3s;
}

/* ── TOPBAR ── */
.topbar {
  z-index: 100; display: flex; align-items: center;
  height: 60px; padding: 0 24px; gap: 8px;
  background: var(--bg2); border-bottom: 1px solid var(--border);
  box-shadow: var(--shadow); flex-shrink: 0;
  transition: background .3s, border-color .3s;
}
.logo {
  font-family: 'Barlow Condensed', sans-serif;
  font-weight: 900; font-size: 22px; letter-spacing: 1px;
  color: var(--text); margin-right: auto;
  transition: color .3s;
}
.logo span { color: var(--orange); }

.nav-link {
  font-size: 13px; font-weight: 600; color: var(--text-dim);
  text-decoration: none; padding: 6px 12px; border-radius: var(--radius-sm);
  transition: all .2s; white-space: nowrap;
}
.nav-link:hover  { color: var(--orange); background: var(--orange-glow); }
.nav-link.active { color: var(--orange); background: var(--orange-glow); }

.topbar-actions { display: flex; align-items: center; gap: 10px; }

.theme-btn {
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius-sm); width: 38px; height: 38px;
  display: flex; align-items: center; justify-content: center;
  cursor: pointer; font-size: 17px; transition: all .2s; flex-shrink: 0;
}
.theme-btn:hover { border-color: var(--orange); transform: rotate(20deg); }

.avatar {
  width: 36px; height: 36px; border-radius: 50%;
  background: linear-gradient(135deg, var(--orange), #FF3D00);
  display: flex; align-items: center; justify-content: center;
  font-weight: 700; font-size: 13px; color: #fff; cursor: pointer;
  border: 2px solid var(--border); transition: border-color .2s; flex-shrink: 0;
}
.avatar:hover { border-color: var(--orange); }

/* ── PAGE WRAPPER ── */
.page {
  max-width: 820px; margin: 0 auto; width: 100%;
  padding: 36px 24px 60px; flex: 1;
}

/* ── PAGE HEADER ── */
.page-header {
  display: flex; align-items: center; justify-content: space-between;
  margin-bottom: 28px; flex-wrap: wrap; gap: 12px;
}
.page-title {
  font-family: 'Barlow Condensed', sans-serif;
  font-weight: 900; font-size: 32px; letter-spacing: .5px;
}
.page-title span { color: var(--orange); }

.header-actions { display: flex; align-items: center; gap: 10px; }

.btn-ghost {
  background: var(--bg3); border: 1px solid var(--border);
  border-radius: var(--radius-sm); padding: 8px 16px;
  font-family: 'Barlow', sans-serif; font-size: 13px; font-weight: 600;
  color: var(--text-dim); cursor: pointer; transition: all .2s;
}
.btn-ghost:hover { border-color: var(--orange); color: var(--orange); }

.unread-count {
  background: var(--orange-glow); color: var(--orange);
  border: 1px solid var(--orange); border-radius: 20px;
  padding: 5px 14px; font-size: 13px; font-weight: 700;
}

/* ── FILTER TABS ── */
.filter-bar {
  display: flex; gap: 8px; margin-bottom: 24px;
  overflow-x: auto; padding-bottom: 4px;
}
.filter-bar::-webkit-scrollbar { display: none; }

.filter-tab {
  display: flex; align-items: center; gap: 6px;
  padding: 8px 16px; border-radius: 20px;
  font-size: 13px; font-weight: 600; cursor: pointer;
  border: 1px solid var(--border); background: var(--bg2);
  color: var(--text-dim); transition: all .2s; white-space: nowrap;
  font-family: 'Barlow', sans-serif;
}
.filter-tab:hover { border-color: var(--orange); color: var(--orange); }
.filter-tab.active {
  background: var(--orange); border-color: var(--orange);
  color: #fff;
}
.filter-tab .count {
  background: rgba(255,255,255,.2); border-radius: 10px;
  padding: 1px 7px; font-size: 11px;
}
.filter-tab:not(.active) .count {
  background: var(--bg4); color: var(--text-dim);
}

/* ── SECTION LABEL ── */
.section-label {
  font-size: 11px; font-weight: 700; letter-spacing: 1.5px;
  text-transform: uppercase; color: var(--text-faint);
  margin-bottom: 10px; margin-top: 28px;
  display: flex; align-items: center; gap: 8px;
}
.section-label::after { content: ''; flex: 1; height: 1px; background: var(--border); }

/* ── NOTIFICATION CARD ── */
.notif-card {
  display: flex; gap: 14px; padding: 16px 18px;
  background: var(--bg2); border: 1px solid var(--border);
  border-radius: var(--radius); margin-bottom: 10px;
  cursor: pointer; transition: all .22s;
  animation: slideUp .3s ease;
  position: relative;
}
@keyframes slideUp {
  from { opacity:0; transform: translateY(10px); }
  to   { opacity:1; transform: translateY(0); }
}
.notif-card:hover {
  border-color: var(--orange);
  background: var(--bg3);
  transform: translateY(-1px);
  box-shadow: 0 4px 16px var(--orange-glow);
}
.notif-card.unread {
  border-left: 3px solid var(--orange);
}
.notif-card.read {
  opacity: .72;
}

/* Icon circle */
.notif-icon {
  width: 44px; height: 44px; border-radius: 50%; flex-shrink: 0;
  display: flex; align-items: center; justify-content: center; font-size: 20px;
}
.notif-icon.match   { background: #FF6A0020; }
.notif-icon.message { background: #3B82F620; }
.notif-icon.result  { background: #F59E0B20; }
.notif-icon.system  { background: #10B98120; }
.notif-icon.challenge { background: #8B5CF620; }

/* Content */
.notif-body { flex: 1; min-width: 0; }
.notif-title {
  font-weight: 700; font-size: 14px; margin-bottom: 4px;
  display: flex; align-items: center; gap: 8px;
}
.notif-text { font-size: 13px; color: var(--text-dim); line-height: 1.5; }
.notif-meta { display: flex; align-items: center; gap: 10px; margin-top: 8px; }
.notif-time { font-size: 12px; color: var(--text-faint); }

.type-badge {
  font-size: 10px; font-weight: 700; letter-spacing: .8px; text-transform: uppercase;
  padding: 2px 8px; border-radius: 4px;
}
.type-badge.match     { background: #FF6A0020; color: #FF6A00; }
.type-badge.message   { background: #3B82F620; color: #60A5FA; }
.type-badge.result    { background: #F59E0B20; color: #FBBF24; }
.type-badge.system    { background: #10B98120; color: #34D399; }
.type-badge.challenge { background: #8B5CF620; color: #A78BFA; }

/* Right side */
.notif-right {
  display: flex; flex-direction: column;
  align-items: flex-end; justify-content: space-between;
  gap: 8px; flex-shrink: 0;
}
.unread-dot {
  width: 9px; height: 9px; border-radius: 50%; background: var(--orange);
  flex-shrink: 0; animation: pulse-dot 2s infinite;
}
@keyframes pulse-dot {
  0%,100% { box-shadow: 0 0 0 0 var(--orange-glow); }
  50%      { box-shadow: 0 0 0 5px transparent; }
}
.dismiss-btn {
  background: none; border: none; cursor: pointer;
  color: var(--text-faint); font-size: 16px; padding: 2px;
  border-radius: 4px; transition: color .2s; line-height: 1;
}
.dismiss-btn:hover { color: var(--text); }

/* ── EMPTY NOTIFICATIONS ── */
.empty-notifs {
  display: flex; flex-direction: column; align-items: center;
  justify-content: center; padding: 80px 40px; gap: 16px; text-align: center;
}
.empty-notifs .en-icon { font-size: 60px; opacity: .18; animation: float 4s ease-in-out infinite; }
@keyframes float {
  0%,100% { transform: translateY(0); }
  50%      { transform: translateY(-10px); }
}
.empty-notifs h3 { font-family: 'Barlow Condensed', sans-serif; font-size: 22px; font-weight: 900; }
.empty-notifs p  { font-size: 14px; color: var(--text-faint); max-width: 300px; line-height: 1.6; }

/* ── SETTINGS STRIP ── */
.settings-strip {
  background: var(--bg2); border: 1px solid var(--border);
  border-radius: var(--radius); padding: 16px 20px;
  display: flex; align-items: center; justify-content: space-between;
  gap: 12px; margin-top: 32px; flex-wrap: wrap;
}
.settings-strip p { font-size: 13px; color: var(--text-dim); }
.settings-strip strong { color: var(--text); }

.toggle-row { display: flex; align-items: center; gap: 14px; flex-wrap: wrap; }
.toggle-item { display: flex; align-items: center; gap: 8px; font-size: 13px; cursor: pointer; }
.toggle-item input[type="checkbox"] { accent-color: var(--orange); width: 16px; height: 16px; cursor: pointer; }
</style>
</head>
<body>

<!-- TOPBAR -->
<div class="topbar">
  <div class="logo">TOURNA<span>MEET</span></div>
  <a href="tournameet-chat.html" class="nav-link">💬 Messages</a>
  <a href="tournameet-notifications.html" class="nav-link active">🔔 Notifications</a>
  <div class="topbar-actions">
    <div class="theme-btn" id="themeToggle" title="Toggle theme">☀️</div>
    <div class="avatar">JD</div>
  </div>
</div>

<!-- PAGE -->
<div class="page">

  <!-- HEADER -->
  <div class="page-header">
    <div class="page-title">🔔 Notifi<span>cations</span></div>
    <div class="header-actions">
      <span class="unread-count" id="unreadLabel">0 unread</span>
      <button class="btn-ghost" id="markAllBtn">Mark all read</button>
      <button class="btn-ghost" id="clearAllBtn">Clear all</button>
    </div>
  </div>

  <!-- FILTER TABS -->
  <div class="filter-bar" id="filterBar">
    <button class="filter-tab active" data-filter="all">
      All <span class="count" id="cAll">0</span>
    </button>
    <button class="filter-tab" data-filter="match">
      ⚔️ Matches <span class="count" id="cMatch">0</span>
    </button>
    <button class="filter-tab" data-filter="message">
      💬 Messages <span class="count" id="cMessage">0</span>
    </button>
    <button class="filter-tab" data-filter="result">
      🏆 Results <span class="count" id="cResult">0</span>
    </button>
    <button class="filter-tab" data-filter="system">
      📋 System <span class="count" id="cSystem">0</span>
    </button>
    <button class="filter-tab" data-filter="challenge">
      🎮 Challenges <span class="count" id="cChallenge">0</span>
    </button>
  </div>

  <!-- NOTIFICATION LIST -->
  <div id="notifContainer"></div>

  <!-- SETTINGS STRIP -->
  <div class="settings-strip">
    <div>
      <strong>Notification Preferences</strong>
      <p>Choose what you want to be notified about</p>
    </div>
    <div class="toggle-row">
      <label class="toggle-item">
        <input type="checkbox" checked id="pref-match"/> Match alerts
      </label>
      <label class="toggle-item">
        <input type="checkbox" checked id="pref-message"/> New messages
      </label>
      <label class="toggle-item">
        <input type="checkbox" checked id="pref-result"/> Results
      </label>
      <label class="toggle-item">
        <input type="checkbox" checked id="pref-system"/> System updates
      </label>
    </div>
  </div>

</div>

<script>
// ── THEME ─────────────────────────────────────────────────────────────────────
const html     = document.documentElement;
const themeBtn = document.getElementById('themeToggle');

function applyTheme(t) {
  html.setAttribute('data-theme', t);
  themeBtn.textContent = t === 'dark' ? '☀️' : '🌙';
  localStorage.setItem('tm-theme', t);
}
applyTheme(localStorage.getItem('tm-theme') || 'dark');
themeBtn.onclick = () =>
  applyTheme(html.getAttribute('data-theme') === 'dark' ? 'light' : 'dark');

// ── DATA ──────────────────────────────────────────────────────────────────────
// In production, this comes from: GET /api/get_notifications.php
// For now it starts empty — no dummy data since no users exist yet.
let notifications = [];

/*
  STRUCTURE of each notification object (from PHP API):
  {
    id:      number,
    type:    'match' | 'message' | 'result' | 'system' | 'challenge',
    icon:    string (emoji),
    title:   string,
    text:    string,
    time:    string,
    is_read: boolean
  }

  To populate once PHP is ready, replace `notifications = []` above with:

  async function loadNotifications() {
    const res  = await fetch('/api/get_notifications.php');
    const data = await res.json();
    notifications = data;
    render();
  }
  loadNotifications();
*/

let activeFilter = 'all';

const typeIcons = {
  match:     '⚔️',
  message:   '💬',
  result:    '🏆',
  system:    '📋',
  challenge: '🎮',
};

// ── RENDER ────────────────────────────────────────────────────────────────────
function render() {
  const container = document.getElementById('notifContainer');
  const filtered  = activeFilter === 'all'
    ? notifications
    : notifications.filter(n => n.type === activeFilter);

  updateCounts();
  updateUnreadLabel();

  if (notifications.length === 0) {
    container.innerHTML = `
      <div class="empty-notifs">
        <div class="en-icon">🔕</div>
        <h3>No Notifications Yet</h3>
        <p>When matches are scheduled, messages arrive, or results are posted — you'll see them right here.</p>
      </div>`;
    return;
  }

  if (filtered.length === 0) {
    container.innerHTML = `
      <div class="empty-notifs">
        <div class="en-icon">${typeIcons[activeFilter] || '🔔'}</div>
        <h3>No ${capitalize(activeFilter)} notifications</h3>
        <p>Nothing in this category right now.</p>
      </div>`;
    return;
  }

  const unread = filtered.filter(n => !n.is_read);
  const read   = filtered.filter(n =>  n.is_read);

  let html = '';
  if (unread.length > 0) {
    html += `<div class="section-label">New</div>`;
    html += unread.map(n => notifCard(n)).join('');
  }
  if (read.length > 0) {
    html += `<div class="section-label">Earlier</div>`;
    html += read.map(n => notifCard(n)).join('');
  }

  container.innerHTML = html;
}

function notifCard(n) {
  return `
  <div class="notif-card ${n.is_read ? 'read' : 'unread'}" id="nc-${n.id}" onclick="markRead(${n.id})">
    <div class="notif-icon ${n.type}">${n.icon || typeIcons[n.type] || '🔔'}</div>
    <div class="notif-body">
      <div class="notif-title">
        ${n.title}
        <span class="type-badge ${n.type}">${n.type}</span>
      </div>
      <div class="notif-text">${n.text}</div>
      <div class="notif-meta">
        <span class="notif-time">🕐 ${n.time}</span>
      </div>
    </div>
    <div class="notif-right">
      ${!n.is_read ? '<div class="unread-dot"></div>' : ''}
      <button class="dismiss-btn" onclick="dismiss(event, ${n.id})" title="Dismiss">✕</button>
    </div>
  </div>`;
}

function updateCounts() {
  const byType = (t) => notifications.filter(n => n.type === t).length;
  document.getElementById('cAll').textContent      = notifications.length;
  document.getElementById('cMatch').textContent    = byType('match');
  document.getElementById('cMessage').textContent  = byType('message');
  document.getElementById('cResult').textContent   = byType('result');
  document.getElementById('cSystem').textContent   = byType('system');
  document.getElementById('cChallenge').textContent= byType('challenge');
}

function updateUnreadLabel() {
  const count = notifications.filter(n => !n.is_read).length;
  document.getElementById('unreadLabel').textContent = `${count} unread`;
}

function capitalize(s) { return s.charAt(0).toUpperCase() + s.slice(1); }

// ── ACTIONS ───────────────────────────────────────────────────────────────────
function markRead(id) {
  const n = notifications.find(x => x.id === id);
  if (n) n.is_read = true;
  render();
  // PHP: fetch('/api/mark_read.php', { method:'POST', body: JSON.stringify({notification_id: id}) })
}

function dismiss(e, id) {
  e.stopPropagation();
  notifications = notifications.filter(n => n.id !== id);
  render();
  // PHP: fetch('/api/delete_notification.php', { method:'POST', body: JSON.stringify({notification_id: id}) })
}

document.getElementById('markAllBtn').onclick = () => {
  notifications.forEach(n => n.is_read = true);
  render();
};

document.getElementById('clearAllBtn').onclick = () => {
  if (notifications.length === 0) return;
  notifications = [];
  render();
};

// ── FILTER TABS ───────────────────────────────────────────────────────────────
document.querySelectorAll('.filter-tab').forEach(tab => {
  tab.onclick = () => {
    document.querySelectorAll('.filter-tab').forEach(t => t.classList.remove('active'));
    tab.classList.add('active');
    activeFilter = tab.dataset.filter;
    render();
  };
});

// ── INIT ──────────────────────────────────────────────────────────────────────
render();
</script>
</body>
</html>
